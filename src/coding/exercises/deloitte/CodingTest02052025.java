package coding.exercises.deloitte;

public class CodingTest02052025 {
    public static void main(String[] args) {

        /*



 @Service
 class ThirdParty{

 public Employee getEmployeeInfo(int id){

 fetch using FeignClient

return Employee;

 }

  public Employee getAddressInfo(int id){

 fetch using FeignClient

return Employee;

 }


 }

@Service
class Sservice{

@Autowire
ThirdParty thirdParty;

public Response processData(int id){

CompletableFuture<EmployeeAddress> cf=  new CompletableFuture();

cf.merge(thirdpart)





}



}

1, HR, 500


Employee --> id, name, deptName
Salary --> id, sal

select q2.deptName

(
select  q1.depName as dName, avg(q1.sal) as average
from
(
select e.id, e.deptName, s.sal from
from  Employee e, Salary s
where e.id = s.id
) q1

grouping by q1.depName

) q2

where q2.sal<5000;



DEpt Avg(Salary)<5000

select  agg.dName
from
(
select
s.depName as dName, avg(s.salary) as average
from  Employee e, Salary s
where e.id = s.id
grouping by s.depName ) agg
where agg.average < 5000;









         */




    }
}
