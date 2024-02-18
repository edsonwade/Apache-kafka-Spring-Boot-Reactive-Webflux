PostgreSQL Command Cheat Sheet

General Commands:
- Connect to PostgreSQL: psql -U username
- Exit psql: \q

Database Operations:
- List all databases: \l
- Connect to a specific database: \c database_name
- Create a new database: CREATE DATABASE database_name;
- Drop a database: DROP DATABASE database_name;

Table Operations:
- List all tables in the current database: \dt
- Show details of a specific table: \d+ table_name
- Create a new table: CREATE TABLE table_name (column1 datatype, column2 datatype, ...);
- Drop a table: DROP TABLE table_name;

Data Manipulation:
- Insert data into a table: INSERT INTO table_name (column1, column2, ...) VALUES (value1, value2, ...);
- Update existing data in a table: UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE condition;
- Delete data from a table: DELETE FROM table_name WHERE condition;

User Management:
- List all users: \du
- Create a new user: CREATE USER username WITH PASSWORD 'password';
- Grant privileges to a user on a database: GRANT ALL PRIVILEGES ON DATABASE database_name TO username;
- Revoke privileges from a user on a database: REVOKE ALL PRIVILEGES ON DATABASE database_name FROM username;
- Drop a user: DROP USER username;


Index Operations:
- Create an index: CREATE INDEX index_name ON table_name (column_name);
- Drop an index: DROP INDEX index_name;

Transaction Management:
- Begin a transaction: BEGIN;
- Commit a transaction: COMMIT;
- Rollback a transaction: ROLLBACK;

Backup and Restore:
- Backup a database: pg_dump -U username database_name > backup_file.sql
- Restore a database: psql -U username -d database_name -f backup_file.sql

Session Information:
- Show current user: SELECT current_user;
- Show current database: SELECT current_database();
- Show server version: SELECT version();

Advanced Operations:
- Run a custom SQL query: \gexec
- Run an external SQL script: \i path/to/script.sql
- Show server configuration: SHOW ALL;
- Show server status: SELECT pg_stat_activity;

Help:
- Get help on SQL commands: \h
- Get help on psql commands: \?
- Get help on a specific command: \h command_name
