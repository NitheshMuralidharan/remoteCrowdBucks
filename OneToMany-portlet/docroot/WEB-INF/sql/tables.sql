create table TEST_Address (
	addressId LONG not null primary key,
	street1 VARCHAR(75) null,
	street2 VARCHAR(75) null,
	city VARCHAR(75) null
);

create table TEST_Employee (
	employeeId LONG not null primary key,
	employeeName VARCHAR(75) null,
	employeeDesignation VARCHAR(75) null
);

create table TEST_Employee_Address (
	addressId LONG not null,
	employeeId LONG not null,
	primary key (addressId, employeeId)
);