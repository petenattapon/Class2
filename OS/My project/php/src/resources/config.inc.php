<?php
$config['db_host']  = 'db';
$config['db_user']  = 'MYSQL_USER';
$config['db_pass']  = 'MYSQL_PASSWORD';
$config['db_name']  = 'blog';

foreach($config as $k => $v){
    define(strtoupper($k),$v);
}