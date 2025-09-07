public class StaticExample_05 {

        int age = 20;            // non-static (object ke sath)
        static int minAge = 18;  // static (class ke sath)

        void showAge() {   // non-static method
            System.out.println(age);
        }

        public static void main(String[] args) {
            // System.out.println(age); ❌ ERROR
            // showAge(); ❌ ERROR

            // ✅ Sahi tareeka → object banao phir access karo
            StaticExample_05 obj = new StaticExample_05();
            System.out.println(obj.age);
            obj.showAge();

            // ✅ static direct access
            System.out.println(StaticExample_05.minAge);
        }


}
