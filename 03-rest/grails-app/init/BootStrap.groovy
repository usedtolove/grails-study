import com.tz.User

class BootStrap {

    def init = { servletContext ->
        def user1 = new User(name:"jack", age: 25).save(failOnError:true);
        def user2 = new User(name:"tom",  age: 26).save(failOnError:true);
        def user3 = new User(name:"mike", age: 27).save(failOnError:true);
    }
    def destroy = {
    }
}
