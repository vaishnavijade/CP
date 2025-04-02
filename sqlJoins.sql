 Write a SQL query to list employee names and department names using an
implicit join, ordered by employee name.
+--------+------------+
| ename  | dname      |
select ename,dname from emp join dept on emp.deptno=dept.deptno order by ename;


Find Departments Without Employees (Using LEFT JOIN and NULL Check)
| Department | Location |
+------------+----------+

select d.dname as Department,d.location as Location from dept d left join emp e on d.deptno=e.deptno where e.deptno is null;


Write a SQL query to list employees and departments where the employee’s 
hire date is after 1980 using INNER JOIN.
+--------+------------+------------+
| ename  | dname      | hiredate   |
select emp.ename,dept.dname,emp.hiredate from emp inner join dept on emp.deptno=dept.deptno where emp.hiredate>'1980-12-31';



Write a SQL query to find departments with more than 3 employees using 
INNER JOIN and HAVING.
s--------+----------+-----------+
| deptno | dname    | emp_count |
select d.deptno,d.dname,count(e.empno) as emp_count from emp e inner join dept d where e.deptno=d.deptno group by deptno having count(e.empno)>3;


Write a SQL query to retrieve average salaries per department using INNER 
JOIN and GROUP BY.
| deptno | dname      | avg_salary  |
+--------+------------+-------------+

select d.deptno,d.dname,avg(e.sal) as avg_salary from emp e inner join dept d on e.deptno=d.deptno group by d.deptno,d.dname;


Write a SQL query to list employees and their managers’ names using a LEFT 
JOIN for employees without managers.
----------+---------+
| employee | manager |
select a.ename as employee,b.ename as manager from emp a left join emp b on a.mgr=b.empno;


Write a SQL query to combine employee and department data with duplicates 
using UNION ALL.
| ename  | dname      |
+--------+------------+
select e.ename,d.dname from emp e left join dept d on e.deptno=d.deptno union all select e.ename,d.dname from emp e right join dept d on e.deptno=d.deptno;

 Write a SQL query to list departments with no assigned employees using 
RIGHT JOIN.
+--------+---------+
| deptno | dname   |
select d.deptno,d.dname from emp e right join dept d on d.deptno=e.deptno where e.empno is null;


Retrieve Department-wise Total Salary and Number of Employees (Using GROUP BY and JOIN)
------------+---------------+--------------+
| dname      | num_employees | total_salary 

select dname,count(empno) as num_employees, sum(sal) as total_salary from dept left join emp on dept.deptno=emp.deptno group by dept.dname;

Write a SQL query to list employee names and department names where the 
department is in 'Chicago' using INNER JOIN.
-------+-------+
| ename | dname |

select e.ename,d.dname from emp e join dept d on e.deptno=d.deptno where d.location="CHICAGO";


Write a SQL query to list all employees and departments, including those 
without matches, using a simulated FULL JOIN.
| empno | ename  | deptno | dname      | location |
select e.empno,e.ename,d.deptno,d.dname,d.location from emp e right join dept d on e.deptno=d.deptno;

Write a SQL query to find managers and the number of employees they manage indepartments located in 'New York', using the primary key and foreign key 
constraints.
+--------------+-----------+
| manager_name | emp_count |

select b.ename as manager_name,count(a.empno) as emp_count from emp a join emp b on a.mgr=b.empno where b.deptno = (select deptno from dept where location = 'NEW YORK') group by b.ename;

Write a SQL query to find departments with number of employees earning less 
than 1000 using NOT EXISTS
+------------+--------+
| dname      | deptno 

select d.dname,d.deptno from dept d where not exists (select * from emp e where e.sal<1000 and e.deptno=d.deptno);


Write a SQL query to list departments with employees earning more than 2500 
using EXISTS
+--------+------------+
| deptno | dname    
select d.deptno,d.dname from dept d where EXISTS (select 1 from emp e where e.sal>2500 and e.deptno=d.deptno);


Write a SQL query to generate all possible employee-department combinations 
using CROSS JOIN.
| ename  | dname      |
+--------+------------+
select e.ename,d.dname from emp e cross join dept d;

 Write a SQL query to find employees who are managers of other employees using 
a self-join.
+---------+
| manager |
uSE test; 
select distinct(b.ename) as manager from emp a join emp b on a.mgr=b.empno; 


Write a SQL query to simulate a FULL OUTER JOIN to list all employees and 
departments, including unmatched rows.
+-------+--------+--------+------------+
| empno | ename  | deptno | dname      |
select e.empno,e.ename,d.deptno,d.dname from emp e right join dept d on d.deptno=e.deptno;

Write a SQL query to list all department numbers, department names and their employee counts, including departments with no employees, using RIGHT JOIN.
-------+------------+-----------+
| deptno | dname      | emp_count |

select d.deptno,d.dname,count(e.empno) as emp_count from emp e right join dept d on e.deptno=d.deptno group by d.deptno,d.dname;

/* Write a SQL query to list employee names and department names for employees with a salary greater than 2000 using INNER JOIN.


+-------+------------+
| ename | dname      |
+-------+------------+
*/
USE test; 

select e.ename,d.dname from emp e inner join dept d on e.deptno=d.deptno  where e.sal>2000;

/* Write a SQL query to retrieve all employees and their department locations, 
including those without departments, using LEFT JOIN.

+--------+----------+
| ename  | location |
+--------+----------+
*/
USE test; 

select e.ename,d.location from emp e left join dept d on e.deptno=d.deptno;











Query to generate a report on student-
SELECT 
    t1.roll, 
    t1.name, 
    t1.age, 
    t2.address, 
    t3.year, 
    t4.hostel
FROM t1
JOIN t2 ON t1.roll = t2.roll
JOIN t3 ON t1.roll = t3.roll
JOIN t4 ON t3.year = t4.year;

to find address of youngest student -
 select t2.address from t1 join t2 on t1.roll=t2.roll where t1.age=(select min(Age) from t1);

to find hostels of oldest students--
 select t4.hostel from t4 join t3 on t4.year=t3.year  join t1 on t1.roll=t3.roll where age=(select max(age) from t1);




Q)select distinct(job),b.ename,e.empno from emp as e1 join emp as e2 on a.job=b.job where empno=(select max(empno) from emp);

 job       | ename  | empno |
+-----------+--------+-------+
| CLERK     | SMITH  |  7369 |
| SALESMAN  | ALLEN  |  7499 |
| SALESMAN  | ALLEN  |  7521 |
| MANAGER   | JONES  |  7566 |
| SALESMAN  | MARTIN |  7654 |
| MANAGER   | BLAKE  |  7698 |
| MANAGER   | CLARK  |  7782 |
| ANALYST   | SCOTT  |  7788 |
| PRESIDENT | KEVIN  |  7839 |
| SALESMAN  | KEVIN  |  7844 |
| CLERK     | KEVIN  |  7876 |
| CLERK     | JAMES  |  7900 |
| ANALYST   | FORD   |  7902 |
| CLERK     | FORD   |  7934 |
i ahve this table i want only distinct jobs and enames empno of those whose empno is max for each job

SELECT e.job, e.ename, e.empno
FROM emp e
INNER JOIN (
    SELECT job, MAX(empno) AS max_empno
    FROM emp
    GROUP BY job
) AS max_emp
ON e.job = max_emp.job AND e.empno = max_emp.max_empno;

OR------
delete t1 from emp t1 join emp t2 where t1.empno<t2.empno and t1.job=t2.job;

mysql> select ename,empno,job from emp;
+-------+-------+-----------+
| ename | empno | job       |
+-------+-------+-----------+
| CLARK |  7782 | MANAGER   |
| KEVIN |  7839 | PRESIDENT |
| KEVIN |  7844 | SALESMAN  |
| FORD  |  7902 | ANALYST   |
| FORD  |  7934 | CLERK     |
+-------+-------+-----------




SET AUTOCOMMIT = 0; is a SQL command used in database management systems like MySQL to disable autocommit mode.

SAVEPOINT doest exists after commits 


, IN, OUT, and INOUT--referece &otcallyvalue