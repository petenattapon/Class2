<?php
$config['db_host']  = 'db-service';
$config['db_user']  = 'MYSQL_USER';
$config['db_pass']  = 'MYSQL_PASSWORD';
$config['db_name']  = 'blog';
$config['db_port']  = 3306;


foreach($config as $k => $v){
    define(strtoupper($k),$v);
}