package IPclient;

import com.Comany.Animal;
import com.Comany.Classif;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IPMain {
    public static void main(String[] args) {
        List<CompanyProject> companyProjects = getCompanyProject();

       Map<Client,List<CompanyProject>>companyMap = companyProjects
               .stream()
               .collect(Collectors.groupingBy(CompanyProject::getClient));
       companyMap.forEach(((client,assisted) ->{
           System.out.println(client);
           assisted.forEach(System.out::println);
           System.out.println();
       }));
    }
    private static List<CompanyProject> getCompanyProject(){
        return List.of(
                new CompanyProject("12-2-1-3","Dilshod","Kurbonov",25,Client.DEVELOPER),
                new CompanyProject("17-3-1-5","Valeri","Vasher",23,Client.ADMIN),
                new CompanyProject("15-1-5-1","Dmitri","Dol",27,Client.USER),
                new CompanyProject("18-2-7-5","Serg","Valer",28,Client.USER)
        );
    }
}
