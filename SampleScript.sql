--<ScriptOptions statementTerminator=";"/>

CREATE TABLE ACCOUNT (
		ACCOUNTNO VARCHAR2(10) NOT NULL,
		PRIMARYCUSTID VARCHAR2(10) NOT NULL,
		BALANCE NUMBER(9 , 2) NOT NULL,
		TYPE VARCHAR2(10) NOT NULL,
		DATEOFACCOUNT DATE NOT NULL
	);

CREATE UNIQUE INDEX SYS_C0011315 ON ACCOUNT (ACCOUNTNO ASC);

ALTER TABLE ACCOUNT ADD CONSTRAINT SYS_C0011315 PRIMARY KEY (ACCOUNTNO);

ALTER TABLE ACCOUNT ADD CONSTRAINT SYS_C0011316 FOREIGN KEY (PRIMARYCUSTID)
	REFERENCES CUSTOMER (CUSTID)
	ON DELETE RESTRICT
	ON UPDATE CASCADE;

