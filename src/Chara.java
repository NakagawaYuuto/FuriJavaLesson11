public class Chara {
        private String job = "冒険者";
        public Chara(String job){
            setJob(job);
        }
        public void  sayJob(){
            System.out.println(this.job + "です。");
        }

        public String getJob(){
            return this.job;
        }
        public void setJob(String job){
            if (!job.equals("魔王")){
                this.job = job;
            }
        }
}
