# SpringBoot-ManyToOneEx
SpringBoot-ManyToOne example with mysql database
# Library USED
JDK-17 , Lombok , MySqlDriver ,SpringDataJPA

# Tool USED
STS-4 , MAVEN , MYSQL DATABASE 

# OUTPUT

mysql> select * from customer;
+-----------+-----------+
| cust_id   | cust_name |
+-----------+-----------+
| 473164911 | LOKESH    |
+-----------+-----------+

mysql> select * from account;
+------------+--------------+-----------+-----------+
| account_id | account_type | bank_name | custfk    |
+------------+--------------+-----------+-----------+
|  134648945 | SAVING       | PNB       | 473164911 |
|  461644679 | SAVING       | HDFC      | 473164911 |
|  796415163 | Current      | ICICI     | 473164911 |
+------------+--------------+-----------+-----------+
