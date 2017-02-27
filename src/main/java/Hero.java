/**
 * Created by andrewlee on 2/25/17.
 */
public class Hero {

        protected String name;
        protected Integer age;

        // ==============================================================
        // Set/get name of a person
        // ==============================================================

        public void setName(String name) {
            this.name = name;
        }
        public void setAge(Integer age) {this.age = age;}

        public String getName() {
            return name;
        }
        public Integer getAge() { return age; }

        public Hero(String name, Integer age){
            this.name = name;
            this.age = age;

        }
    }
