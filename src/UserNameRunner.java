import java.util.ArrayList;
public class UserNameRunner
{
    public static void main(String[] args)
    {
        //Part (a)
        System.out.println("Part (a):");
        UserNameSolution person= new UserNameSolution("john","smith");
        ArrayList<String> johnSmithPossibleNames = person.getPossibleNames();
        System.out.println("johnSmithPossibleNames = "+johnSmithPossibleNames);

        //Part (b)
        System.out.println("Part (b):");
        String[] used = {"harta", "hartm", "harty"};
        UserNameSolution person2 = new UserNameSolution("mary", "hart");
        ArrayList<String> maryHartPossibleNames = person2.getPossibleNames();
        System.out.println("Original maryHartPossibleNames = "+ maryHartPossibleNames);
        person2.setAvailableUserNames(used);
        System.out.println("resetting available names... with used[] = {\"harta\", \"hartm\", \"harty\"}");
        maryHartPossibleNames = person2.getPossibleNames();
        System.out.println("After setting maryHartPossibleNames = "+ maryHartPossibleNames);

        //Additional test
        System.out.println("Additional test:");
        String[] used2 = {"vaughand","vaughando"};
        UserNameSolution person3 = new UserNameSolution("dorothy", "vaughan");
        ArrayList<String> dorothyVaughan = person3.getPossibleNames();
        System.out.println("Original dorothyVaughanPossibleNames = "+ dorothyVaughan);
        person3.setAvailableUserNames(used2);
        System.out.println("resetting available names... with used[] = {\"vaughand\",\"vaughando\"}");
        dorothyVaughan = person3.getPossibleNames();
        System.out.println("After setting dorthyVaughanPossibleNames = "+ dorothyVaughan);

    }
}