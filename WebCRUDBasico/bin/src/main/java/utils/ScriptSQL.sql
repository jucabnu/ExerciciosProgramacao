/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  juliano.vieira
 * Created: 14/02/2017
 */

DROP DATABASE IF NOT EXISTS WEBCRUDBASICO;  

CREATE DATABASE WEBCRUDBASICO;  

USE WEBCRUDBASICO;

DROP TABLE 'item';

CREATE TABLE item (
  id mediumint(8) unsigned NOT NULL auto_increment,
  nome varchar(255) default NULL,
  barcode mediumint default NULL,
  PRIMARY KEY (id)
) AUTO_INCREMENT=1;


INSERT INTO item (nome,barcode) VALUES ('item 1', 254),('item 2', 224),('item 3', 354),('item 4', 454),('item 5', 554);


SET @@global.time_zone = '+3:00';
QUIT