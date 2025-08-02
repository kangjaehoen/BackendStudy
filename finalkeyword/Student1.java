package finalkeyword;

    public class Student1 {
        private final StringBuilder name;

        // 생성자: 외부에서 받은 name을 복사해서 내부에 저장
        public Student1(StringBuilder name) {
            this.name = new StringBuilder(name.toString());
        }

        // getter: 내부 name을 그대로 반환하지 않고 복사해서 반환
        public StringBuilder getName() {
            return new StringBuilder(name.toString());
        }
    }
