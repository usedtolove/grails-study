import com.tz.Department
import com.tz.Employee

class BootStrap {

    def init = { servletContext ->
        def d1 = new Department(name:"dept1").save(failOnError:true);

        def e1 = new Employee(name:"jack",age:25,dept: d1).save(failOnError:true);
        def e2 = new Employee(name:"mike",age:26,dept: d1).save(failOnError:true);
    }

    def destroy = {
    }
}
