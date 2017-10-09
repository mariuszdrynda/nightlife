DROP DATABASE IF EXISTS nightlifedb;

DROP ROLE IF EXISTS nightlifeuser;

CREATE USER nightlifeuser;
ALTER USER nightlifeuser with ENCRYPTED password 'solsoft';
DROP DATABASE IF EXISTS nightlifedb;
CREATE DATABASE nightlifedb WITH ENCODING 'UNICODE' OWNER nightlifeuser;
