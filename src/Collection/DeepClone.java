//import lombok.Getter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Getter
//public class DeepClone {
//
//    private String samosa;
//    public List<String> domain=new ArrayList<>();
//
//    public DeepClone(String samosa, List<String> domain) {
//        this.samosa=samosa;
//        this.domain=domain;
//    }
//
//    public void setDomain(List<String> domain){
//        this.domain=domain;
//    }
//
//    public List<String> getDomain(){
//        return this.domain;
//    }
//
//
//    public void setSamosa(String samosa){
//        this.samosa=samosa;
//    }
//
//    public DeepClone toDeepClone(){
//        DeepClone samosa=new DeepClone();
//        samosa.setSamosa(this.samosa);
//        for (String d:this.domain){
//            samosa.getDomain().add(d);
//        }
//        return samosa;
//    }
//
//    public DeepClone toShallowClone(){
//        return new DeepClone(this.samosa,this.domain);
//    }
//    public String toString(){
//        return samosa+domain.toString();
//    }
//    public DeepClone(){
//
//    }
//}
