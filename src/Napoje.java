 public abstract class Napoje {
        protected String nazwa;

        public Napoje(String nazwa) {
            this.nazwa = nazwa;
        }

     public String getNazwa() {
         return nazwa;
     }

     public abstract String pij();
    }
