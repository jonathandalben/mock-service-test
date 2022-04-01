drop table if exists gh_rooms;
 
create table gh_rooms (
  id int auto_increment  primary key,
  r_roomNumber varchar(250) not null,
  r_roomCategory varchar(250) not null,
  r_roomRate varchar(250) not null,
  r_roomType varchar(250) not null
);

insert into gh_rooms(r_roomNumber,r_roomCategory,r_roomRate,r_roomType)  
values('A','STANDARD','1000','SINGLE'),
('B','STANDARD','1000','SINGLE'),
('C','STANDARD','1000','SINGLE'),
('D','STANDARD','1000','SINGLE'),
('E','STANDARD','1000','SINGLE'),
('F','STANDARD','1000','SINGLE'),
('G','STANDARD','1000','SINGLE'),
('H','STANDARD','1000','SINGLE'),
--('I','STANDARD','1000','SINGLE'),
--('J','STANDARD','1000','SINGLE'),
--('K','STANDARD','1000','SINGLE'),
--('L','STANDARD','1000','SINGLE'),
--('M','STANDARD','1000','SINGLE'),
--('N','STANDARD','1000','SINGLE'),
--('O','STANDARD','1000','SINGLE'),
--('P','STANDARD','1000','SINGLE'),
--('Q','STANDARD','1000','SINGLE'),
--('R','STANDARD','1000','SINGLE'),
--('S','STANDARD','1000','SINGLE'),
--('T','STANDARD','1000','SINGLE'),
--('U','STANDARD','1000','SINGLE'),
--('V','STANDARD','1000','SINGLE'),
--('W','STANDARD','1000','SINGLE'),
--('X','STANDARD','1000','SINGLE'),
--('Y','STANDARD','1000','SINGLE'),
--('Z','STANDARD','1000','SINGLE'),
--('AA','HIGH-CLASS','2000','SINGLE'),
--('AB','HIGH-CLASS','2000','SINGLE'),
--('AC','HIGH-CLASS','2000','SINGLE'),
--('AD','HIGH-CLASS','2000','SINGLE'),
--('AE','HIGH-CLASS','2000','SINGLE'),
--('AF','HIGH-CLASS','2000','SINGLE'),
--('AG','HIGH-CLASS','2000','SINGLE'),
--('AH','HIGH-CLASS','2000','SINGLE'),
--('AI','HIGH-CLASS','2000','SINGLE'),
--('AJ','HIGH-CLASS','2000','SINGLE'),
--('AK','HIGH-CLASS','2000','SINGLE'),
--('AL','HIGH-CLASS','2000','SINGLE'),
--('AM','HIGH-CLASS','2000','SINGLE'),
--('AN','HIGH-CLASS','2000','SINGLE'),
--('AO','HIGH-CLASS','2000','SINGLE'),
--('AP','HIGH-CLASS','2000','SINGLE'),
--('AQ','HIGH-CLASS','2000','SINGLE'),
--('AR','HIGH-CLASS','2000','SINGLE'),
--('AS','HIGH-CLASS','2000','SINGLE'),
--('AT','HIGH-CLASS','2000','SINGLE'),
--('AU','HIGH-CLASS','2000','SINGLE'),
--('AV','HIGH-CLASS','2000','SINGLE'),
--('AW','HIGH-CLASS','2000','SINGLE'),
--('AX','HIGH-CLASS','2000','SINGLE'),
--('AY','HIGH-CLASS','2000','SINGLE'),
--('AZ','HIGH-CLASS','2000','SINGLE'),
--('BA','ELEGANT','3000','SINGLE'),
--('BB','ELEGANT','3000','SINGLE'),
--('BC','ELEGANT','3000','SINGLE'),
--('BD','ELEGANT','3000','SINGLE'),
--('BE','ELEGANT','3000','SINGLE'),
--('BF','ELEGANT','3000','SINGLE'),
--('BG','ELEGANT','3000','SINGLE'),
--('BH','ELEGANT','3000','SINGLE'),
--('BI','ELEGANT','3000','SINGLE'),
--('BJ','ELEGANT','3000','SINGLE'),
--('BK','ELEGANT','3000','SINGLE'),
--('BL','ELEGANT','3000','SINGLE'),
--('BM','ELEGANT','3000','SINGLE'),
--('BN','ELEGANT','3000','SINGLE'),
--('BO','ELEGANT','3000','SINGLE'),
--('BP','ELEGANT','3000','SINGLE'),
--('BQ','ELEGANT','3000','SINGLE'),
--('BR','ELEGANT','3000','SINGLE'),
--('BS','ELEGANT','3000','SINGLE'),
--('BT','ELEGANT','3000','SINGLE'),
--('BU','ELEGANT','3000','SINGLE'),
--('BV','ELEGANT','3000','SINGLE'),
--('BW','ELEGANT','3000','SINGLE'),
--('BX','ELEGANT','3000','SINGLE'),
--('BY','ELEGANT','3000','SINGLE'),
--('BZ','ELEGANT','3000','SINGLE'),
--('DA','STANDARD','1500','COUPLE'),
--('DB','STANDARD','1500','COUPLE'),
--('DC','STANDARD','1500','COUPLE'),
--('DD','STANDARD','1500','COUPLE'),
--('DE','STANDARD','1500','COUPLE'),
--('DF','STANDARD','1500','COUPLE'),
--('DG','STANDARD','1500','COUPLE'),
--('DH','STANDARD','1500','COUPLE'),
--('DI','STANDARD','1500','COUPLE'),
--('DJ','STANDARD','1500','COUPLE'),
--('DK','STANDARD','1500','COUPLE'),
--('DL','STANDARD','1500','COUPLE'),
--('DM','STANDARD','1500','COUPLE'),
--('DN','STANDARD','1500','COUPLE'),
--('DO','STANDARD','1500','COUPLE'),
--('DP','STANDARD','1500','COUPLE'),
--('DQ','STANDARD','1500','COUPLE'),
--('DR','STANDARD','1500','COUPLE'),
--('DS','STANDARD','1500','COUPLE'),
--('DT','STANDARD','1500','COUPLE'),
--('DU','STANDARD','1500','COUPLE'),
--('DV','STANDARD','1500','COUPLE'),
--('DW','STANDARD','1500','COUPLE'),
--('DX','STANDARD','1500','COUPLE'),
--('DY','STANDARD','1500','COUPLE'),
--('DZ','STANDARD','1500','COUPLE'),
--('EA','HIGH-CLASS','2500','COUPLE'),
--('EB','HIGH-CLASS','2500','COUPLE'),
--('EC','HIGH-CLASS','2500','COUPLE'),
--('ED','HIGH-CLASS','2500','COUPLE'),
--('EE','HIGH-CLASS','2500','COUPLE'),
--('EF','HIGH-CLASS','2500','COUPLE'),
--('EG','HIGH-CLASS','2500','COUPLE'),
--('EH','HIGH-CLASS','2500','COUPLE'),
--('EI','HIGH-CLASS','2500','COUPLE'),
--('EJ','HIGH-CLASS','2500','COUPLE'),
--('EK','HIGH-CLASS','2500','COUPLE'),
--('EL','HIGH-CLASS','2500','COUPLE'),
--('EM','HIGH-CLASS','2500','COUPLE'),
--('EN','HIGH-CLASS','2500','COUPLE'),
--('EO','HIGH-CLASS','2500','COUPLE'),
--('EP','HIGH-CLASS','2500','COUPLE'),
--('EQ','HIGH-CLASS','2500','COUPLE'),
--('ER','HIGH-CLASS','2500','COUPLE'),
--('ES','HIGH-CLASS','2500','COUPLE'),
--('ET','HIGH-CLASS','2500','COUPLE'),
--('EU','HIGH-CLASS','2500','COUPLE'),
--('EV','HIGH-CLASS','2500','COUPLE'),
--('EW','HIGH-CLASS','2500','COUPLE'),
--('EX','HIGH-CLASS','2500','COUPLE'),
--('EY','HIGH-CLASS','2500','COUPLE'),
--('EZ','HIGH-CLASS','2500','COUPLE'),
--('FA','ELEGANT','3500','COUPLE'),
--('FB','ELEGANT','3500','COUPLE'),
--('FC','ELEGANT','3500','COUPLE'),
--('FD','ELEGANT','3500','COUPLE'),
--('FE','ELEGANT','3500','COUPLE'),
--('FF','ELEGANT','3500','COUPLE'),
--('FG','ELEGANT','3500','COUPLE'),
--('FH','ELEGANT','3500','COUPLE'),
--('FI','ELEGANT','3500','COUPLE'),
--('FJ','ELEGANT','3500','COUPLE'),
--('FK','ELEGANT','3500','COUPLE'),
--('FL','ELEGANT','3500','COUPLE'),
--('FM','ELEGANT','3500','COUPLE'),
--('FN','ELEGANT','3500','COUPLE'),
--('FO','ELEGANT','3500','COUPLE'),
--('FP','ELEGANT','3500','COUPLE'),
--('FQ','ELEGANT','3500','COUPLE'),
--('FR','ELEGANT','3500','COUPLE'),
--('FS','ELEGANT','3500','COUPLE'),
--('FT','ELEGANT','3500','COUPLE'),
--('FU','ELEGANT','3500','COUPLE'),
--('FV','ELEGANT','3500','COUPLE'),
--('FW','ELEGANT','3500','COUPLE'),
--('FX','ELEGANT','3500','COUPLE'),
--('FY','ELEGANT','3500','COUPLE'),
--('FZ','ELEGANT','3500','COUPLE'),
--('GA','STANDARD','2000','FAMILY'),
--('GB','STANDARD','2000','FAMILY'),
--('GC','STANDARD','2000','FAMILY'),
--('GD','STANDARD','2000','FAMILY'),
--('GE','STANDARD','2000','FAMILY'),
--('GF','STANDARD','2000','FAMILY'),
--('GG','STANDARD','2000','FAMILY'),
--('GH','STANDARD','2000','FAMILY'),
--('GI','STANDARD','2000','FAMILY'),
--('GJ','STANDARD','2000','FAMILY'),
--('GK','STANDARD','2000','FAMILY'),
--('GL','STANDARD','2000','FAMILY'),
--('GM','STANDARD','2000','FAMILY'),
--('GN','STANDARD','2000','FAMILY'),
--('GO','STANDARD','2000','FAMILY'),
--('GP','STANDARD','2000','FAMILY'),
--('GQ','STANDARD','2000','FAMILY'),
--('GR','STANDARD','2000','FAMILY'),
--('GS','STANDARD','2000','FAMILY'),
--('GT','STANDARD','2000','FAMILY'),
--('GU','STANDARD','2000','FAMILY'),
--('GV','STANDARD','2000','FAMILY'),
--('GW','STANDARD','2000','FAMILY'),
--('GX','STANDARD','2000','FAMILY'),
--('GY','STANDARD','2000','FAMILY'),
--('GZ','STANDARD','2000','FAMILY'),
--('HA','HIGH-CLASS','3000','FAMILY'),
--('HB','HIGH-CLASS','3000','FAMILY'),
--('HC','HIGH-CLASS','3000','FAMILY'),
--('HD','HIGH-CLASS','3000','FAMILY'),
--('HE','HIGH-CLASS','3000','FAMILY'),
--('HF','HIGH-CLASS','3000','FAMILY'),
--('HG','HIGH-CLASS','3000','FAMILY'),
--('HH','HIGH-CLASS','3000','FAMILY'),
--('HI','HIGH-CLASS','3000','FAMILY'),
--('HJ','HIGH-CLASS','3000','FAMILY'),
--('HK','HIGH-CLASS','3000','FAMILY'),
--('HL','HIGH-CLASS','3000','FAMILY'),
--('HM','HIGH-CLASS','3000','FAMILY'),
--('HN','HIGH-CLASS','3000','FAMILY'),
--('HO','HIGH-CLASS','3000','FAMILY'),
--('HP','HIGH-CLASS','3000','FAMILY'),
--('HQ','HIGH-CLASS','3000','FAMILY'),
--('HR','HIGH-CLASS','3000','FAMILY'),
--('HS','HIGH-CLASS','3000','FAMILY'),
--('HT','HIGH-CLASS','3000','FAMILY'),
--('HU','HIGH-CLASS','3000','FAMILY'),
--('HV','HIGH-CLASS','3000','FAMILY'),
--('HW','HIGH-CLASS','3000','FAMILY'),
--('HX','HIGH-CLASS','3000','FAMILY'),
--('HY','HIGH-CLASS','3000','FAMILY'),
--('HZ','HIGH-CLASS','3000','FAMILY'),
--('IA','ELEGANT','4000','FAMILY'),
--('IB','ELEGANT','4000','FAMILY'),
--('IC','ELEGANT','4000','FAMILY'),
--('ID','ELEGANT','4000','FAMILY'),
--('IE','ELEGANT','4000','FAMILY'),
--('IF','ELEGANT','4000','FAMILY'),
--('IG','ELEGANT','4000','FAMILY'),
--('IH','ELEGANT','4000','FAMILY'),
--('II','ELEGANT','4000','FAMILY'),
--('IJ','ELEGANT','4000','FAMILY'),
--('IK','ELEGANT','4000','FAMILY'),
--('IL','ELEGANT','4000','FAMILY'),
--('IM','ELEGANT','4000','FAMILY'),
--('IN','ELEGANT','4000','FAMILY'),
--('IO','ELEGANT','4000','FAMILY'),
--('IP','ELEGANT','4000','FAMILY'),
--('IQ','ELEGANT','4000','FAMILY'),
--('IR','ELEGANT','4000','FAMILY'),
--('IS','ELEGANT','4000','FAMILY'),
--('IT','ELEGANT','4000','FAMILY'),
--('IU','ELEGANT','4000','FAMILY'),
--('IV','ELEGANT','4000','FAMILY'),
--('IW','ELEGANT','4000','FAMILY'),
--('IX','ELEGANT','4000','FAMILY'),
--('IY','ELEGANT','4000','FAMILY'),
--('IZ','ELEGANT','4000','FAMILY'),
--('JA','STANDARD','2500','TEAM'),
--('JB','STANDARD','2500','TEAM'),
--('JC','STANDARD','2500','TEAM'),
--('JD','STANDARD','2500','TEAM'),
--('JE','STANDARD','2500','TEAM'),
--('JF','STANDARD','2500','TEAM'),
--('JG','STANDARD','2500','TEAM'),
--('JH','STANDARD','2500','TEAM'),
--('JI','STANDARD','2500','TEAM'),
--('JJ','STANDARD','2500','TEAM'),
--('JK','STANDARD','2500','TEAM'),
--('JL','STANDARD','2500','TEAM'),
--('JM','STANDARD','2500','TEAM'),
--('JN','STANDARD','2500','TEAM'),
--('JO','STANDARD','2500','TEAM'),
--('JP','STANDARD','2500','TEAM'),
--('JQ','STANDARD','2500','TEAM'),
--('JR','STANDARD','2500','TEAM'),
--('JS','STANDARD','2500','TEAM'),
--('JT','STANDARD','2500','TEAM'),
--('JU','STANDARD','2500','TEAM'),
--('JV','STANDARD','2500','TEAM'),
--('JW','STANDARD','2500','TEAM'),
--('JX','STANDARD','2500','TEAM'),
--('JY','STANDARD','2500','TEAM'),
--('JZ','STANDARD','2500','TEAM'),
--('KA','HIGH-CLASS','3500','TEAM'),
--('KB','HIGH-CLASS','3500','TEAM'),
--('KC','HIGH-CLASS','3500','TEAM'),
--('KD','HIGH-CLASS','3500','TEAM'),
--('KE','HIGH-CLASS','3500','TEAM'),
--('KF','HIGH-CLASS','3500','TEAM'),
--('KG','HIGH-CLASS','3500','TEAM'),
--('KH','HIGH-CLASS','3500','TEAM'),
--('KI','HIGH-CLASS','3500','TEAM'),
--('KJ','HIGH-CLASS','3500','TEAM'),
--('KK','HIGH-CLASS','3500','TEAM'),
--('KL','HIGH-CLASS','3500','TEAM'),
--('KM','HIGH-CLASS','3500','TEAM'),
--('KN','HIGH-CLASS','3500','TEAM'),
--('KO','HIGH-CLASS','3500','TEAM'),
--('KP','HIGH-CLASS','3500','TEAM'),
--('KQ','HIGH-CLASS','3500','TEAM'),
--('KR','HIGH-CLASS','3500','TEAM'),
--('KS','HIGH-CLASS','3500','TEAM'),
--('KT','HIGH-CLASS','3500','TEAM'),
--('KU','HIGH-CLASS','3500','TEAM'),
--('KV','HIGH-CLASS','3500','TEAM'),
--('KW','HIGH-CLASS','3500','TEAM'),
--('KX','HIGH-CLASS','3500','TEAM'),
--('KY','HIGH-CLASS','3500','TEAM'),
--('KZ','HIGH-CLASS','3500','TEAM'),
--('LA','ELEGANT','4500','TEAM'),
--('LB','ELEGANT','4500','TEAM'),
--('LC','ELEGANT','4500','TEAM'),
--('LD','ELEGANT','4500','TEAM'),
--('LE','ELEGANT','4500','TEAM'),
--('LF','ELEGANT','4500','TEAM'),
--('LG','ELEGANT','4500','TEAM'),
--('LH','ELEGANT','4500','TEAM'),
--('LI','ELEGANT','4500','TEAM'),
--('LJ','ELEGANT','4500','TEAM'),
--('LK','ELEGANT','4500','TEAM'),
--('LL','ELEGANT','4500','TEAM'),
--('LM','ELEGANT','4500','TEAM'),
--('LN','ELEGANT','4500','TEAM'),
--('LO','ELEGANT','4500','TEAM'),
--('LP','ELEGANT','4500','TEAM'),
--('LQ','ELEGANT','4500','TEAM'),
--('LR','ELEGANT','4500','TEAM'),
--('LS','ELEGANT','4500','TEAM'),
--('LT','ELEGANT','4500','TEAM'),
--('LU','ELEGANT','4500','TEAM'),
--('LV','ELEGANT','4500','TEAM'),
--('LW','ELEGANT','4500','TEAM'),
--('LX','ELEGANT','4500','TEAM'),
--('LY','ELEGANT','4500','TEAM'),
--('LZ','ELEGANT','4500','TEAM'),
--('MA','STANDARD','3000','EXCLUSIVE'),
--('MB','STANDARD','3000','EXCLUSIVE'),
--('MC','STANDARD','3000','EXCLUSIVE'),
--('MD','STANDARD','3000','EXCLUSIVE'),
--('ME','STANDARD','3000','EXCLUSIVE'),
--('MF','STANDARD','3000','EXCLUSIVE'),
--('MG','STANDARD','3000','EXCLUSIVE'),
--('MH','STANDARD','3000','EXCLUSIVE'),
--('MI','STANDARD','3000','EXCLUSIVE'),
--('MJ','STANDARD','3000','EXCLUSIVE'),
--('MK','STANDARD','3000','EXCLUSIVE'),
--('ML','STANDARD','3000','EXCLUSIVE'),
--('MM','STANDARD','3000','EXCLUSIVE'),
--('MN','STANDARD','3000','EXCLUSIVE'),
--('MO','STANDARD','3000','EXCLUSIVE'),
--('MP','STANDARD','3000','EXCLUSIVE'),
--('MQ','STANDARD','3000','EXCLUSIVE'),
--('MR','STANDARD','3000','EXCLUSIVE'),
--('MS','STANDARD','3000','EXCLUSIVE'),
--('MT','STANDARD','3000','EXCLUSIVE'),
--('MU','STANDARD','3000','EXCLUSIVE'),
--('MV','STANDARD','3000','EXCLUSIVE'),
--('MW','STANDARD','3000','EXCLUSIVE'),
--('MX','STANDARD','3000','EXCLUSIVE'),
--('MY','STANDARD','3000','EXCLUSIVE'),
--('MZ','STANDARD','3000','EXCLUSIVE'),
--('NA','HIGH-CLASS','4000','EXCLUSIVE'),
--('NB','HIGH-CLASS','4000','EXCLUSIVE'),
--('NC','HIGH-CLASS','4000','EXCLUSIVE'),
--('ND','HIGH-CLASS','4000','EXCLUSIVE'),
--('NE','HIGH-CLASS','4000','EXCLUSIVE'),
--('NF','HIGH-CLASS','4000','EXCLUSIVE'),
--('NG','HIGH-CLASS','4000','EXCLUSIVE'),
--('NH','HIGH-CLASS','4000','EXCLUSIVE'),
--('NI','HIGH-CLASS','4000','EXCLUSIVE'),
--('NJ','HIGH-CLASS','4000','EXCLUSIVE'),
--('NK','HIGH-CLASS','4000','EXCLUSIVE'),
--('NL','HIGH-CLASS','4000','EXCLUSIVE'),
--('NM','HIGH-CLASS','4000','EXCLUSIVE'),
--('NN','HIGH-CLASS','4000','EXCLUSIVE'),
--('NO','HIGH-CLASS','4000','EXCLUSIVE'),
--('NP','HIGH-CLASS','4000','EXCLUSIVE'),
--('NQ','HIGH-CLASS','4000','EXCLUSIVE'),
--('NR','HIGH-CLASS','4000','EXCLUSIVE'),
--('NS','HIGH-CLASS','4000','EXCLUSIVE'),
--('NT','HIGH-CLASS','4000','EXCLUSIVE'),
--('NU','HIGH-CLASS','4000','EXCLUSIVE'),
--('NV','HIGH-CLASS','4000','EXCLUSIVE'),
--('NW','HIGH-CLASS','4000','EXCLUSIVE'),
--('NX','HIGH-CLASS','4000','EXCLUSIVE'),
--('NY','HIGH-CLASS','4000','EXCLUSIVE'),
--('NZ','HIGH-CLASS','4000','EXCLUSIVE'),
--('OA','ELEGANT','5000','EXCLUSIVE'),
--('OB','ELEGANT','5000','EXCLUSIVE'),
--('OC','ELEGANT','5000','EXCLUSIVE'),
--('OD','ELEGANT','5000','EXCLUSIVE'),
--('OE','ELEGANT','5000','EXCLUSIVE'),
--('OF','ELEGANT','5000','EXCLUSIVE'),
--('OG','ELEGANT','5000','EXCLUSIVE'),
--('OH','ELEGANT','5000','EXCLUSIVE'),
--('OI','ELEGANT','5000','EXCLUSIVE'),
--('OJ','ELEGANT','5000','EXCLUSIVE'),
--('OK','ELEGANT','5000','EXCLUSIVE'),
--('OL','ELEGANT','5000','EXCLUSIVE'),
--('OM','ELEGANT','5000','EXCLUSIVE'),
--('ON','ELEGANT','5000','EXCLUSIVE'),
--('OO','ELEGANT','5000','EXCLUSIVE'),
--('OP','ELEGANT','5000','EXCLUSIVE'),
--('OQ','ELEGANT','5000','EXCLUSIVE'),
--('OR','ELEGANT','5000','EXCLUSIVE'),
--('OS','ELEGANT','5000','EXCLUSIVE'),
--('OT','ELEGANT','5000','EXCLUSIVE'),
--('OU','ELEGANT','5000','EXCLUSIVE'),
--('OV','ELEGANT','5000','EXCLUSIVE'),
--('OW','ELEGANT','5000','EXCLUSIVE'),
--('OX','ELEGANT','5000','EXCLUSIVE'),
--('OY','ELEGANT','5000','EXCLUSIVE'),
('OZ','ELEGANT','5000','EXCLUSIVE');


drop table if exists gh_customer_group;
 
create table gh_customer_group (
  id int auto_increment  primary key
);

insert into gh_customer_group(id) 
values(null);

drop table if exists gh_customer;
 
create table gh_customer (
  id int auto_increment  primary key,
  c_firstName varchar(250) not null,
  c_lastName varchar(250) not null,
  c_middleName varchar(250),
  c_salutation varchar(250),
  c_mobile varchar(250),
  c_phone varchar(250),
  c_room int not null,
  c_customerGroup int,
  foreign key (c_room) references gh_rooms(id),
  foreign key (c_customerGroup) references gh_customer_group(id)
);

insert into gh_customer(c_firstName,c_lastName,c_room,c_customerGroup) 
values('Jonny','Dalben',1,1);

drop table if exists gh_check_in;
 
create table gh_check_in (
  id int auto_increment  primary key,
  ci_checkIn timestamp default current_timestamp,
  ci_room int not null,
  ci_customer int,
  ci_customerGroup int,
  foreign key (ci_room) references gh_rooms(id),
  foreign key (ci_customer) references gh_customer(id),
  foreign key (ci_customerGroup) references gh_customer_group(id)
);

insert into gh_check_in(ci_room,ci_customer) 
values(1,1);

drop table if exists gh_check_out;
 
create table gh_check_out (
  id int auto_increment  primary key,
  co_checkout timestamp default current_timestamp,
  co_room int not null,
  co_customer int,
  co_customerGroup int,
  foreign key (co_room) references gh_rooms(id),
  foreign key (co_customer) references gh_customer(id),
  foreign key (co_customerGroup) references gh_customer_group(id)
);

insert into gh_check_out(co_room,co_customer) 
values(1,1);