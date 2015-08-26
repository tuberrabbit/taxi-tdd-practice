# taxi-tdd-practice

出租车计价： 1. 起步价为2公里内6元； 2. 公里运价为1.5元； 3. 8公里起加收50%公里运价； 4. 四舍五入到元； 5. 停车等待时每分钟0.25元。

tip：跟赵老师讨论后，2公里内的等待时间也计费。

##story 1:
As a passenger,  
when I take a driver for 2 kilometers but no waiting time,  
so that I should pay 6 yuan.    

Conditions: it will cost 6 yuan if the distance is less and equal than 2 kilometers.  

##story 2:
As a passenger,  
when I take a driver for 8 kilometers but no waiting time,  
so that I should pay 15 yuan.  

Conditions: it will const 1.5 yuan per kilometer which is more than 2 kilometers.  

##story 3:
As a passenger,  
when I take a driver for 5 kilometers but no waiting time,  
so that I should pay 11 yuan.  

Condition: it should round to 1 yuan.

##story 4:
As a passenger,  
when I take a driver for 11 kilometers but no waiting time,  
so that I should pay 22 yuan.

Conditions: it will const 50% more than per kilometer's price.  

##story 5:
As a passenger,
when I take a driver for 11 kilometers and wait for 3 minutes,  
so that I should pay 23 yuan.  

Conditions: it will const 0.25 yuan per minute for waiting.  

