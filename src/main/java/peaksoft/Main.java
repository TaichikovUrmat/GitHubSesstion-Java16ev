package peaksoft;

import peaksoft.models.User;
import peaksoft.models.Group;
public class Main {
    public static void main(String[] args) {


//         -- TODO  create branch
//          git branch fature/urmat

//      TODO  bashka branchke otyy
//       git checkout fature/urmat
//
//         -- TODO Проверка статуса и истории and push
//          git status
//       TODO   git add .
//         git status
//         git commit -m "git method"
//         git push -u origin fature/urmat

        User user = new User();
        user.setId(1L);
        user.setEmail("Aibek");
        user.setFirstName("Aibek1");
        user.setLastName("Aibek2");
        Group group = new Group();
        group.setId(1L);
        group.setGroupName("Group 1");
        group.setDescription("Group 2");










    }
}