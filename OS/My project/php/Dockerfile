FROM php:8.0-apache
COPY ./src/php /var/www/html/
RUN docker-php-ext-install mysqli && docker-php-ext-enable mysqli
RUN apt-get update && apt-get upgrade -y
RUN docker-php-ext-install pdo pdo_mysql
EXPOSE 80