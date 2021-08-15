package JavaDasar;

public class InnerClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // InnerClass
    public class Inner {

        private String name;

        public String getInnerClass(){
            return InnerClass.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}