#### Stage 1: Build the react application
FROM node:12.4.0-alpine as build

WORKDIR /app

# Copy the package.json as well as the package-lock.json and install 
# the dependencies. This is a separate step so the dependencies 
# will be cached unless changes to one of those two files 
# are made.
COPY package.json package-lock.json ./
RUN npm install

COPY . ./

RUN npm run build

#### Stage 2
FROM nginx:1.19

COPY --from=build /app/build /var/www
RUN chown -R nginx:nginx /var/www/;

COPY default.conf.template /default.conf.template

EXPOSE 80

COPY entrypoint.sh /
RUN chmod +x /entrypoint.sh

ENTRYPOINT ["/entrypoint.sh"]
