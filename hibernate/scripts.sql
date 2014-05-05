create table College_TbL(
    colId int primary key,
    colName varchar(100),
    uniName varchar(100)
);

create table Student_tbl(
    stId int primary key,
    stName varchar(100),
    collegeId int references College_Tbl
);
