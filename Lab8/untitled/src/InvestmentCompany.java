public class InvestmentCompany {

    public static void main(String[] args){
        Programmer programmer1 = new Programmer(10, "Tobi");
        Programmer programmer2 = new Programmer(20 , "Ana");
        ProjectOpenSource openSource1 = new ProjectOpenSource("java dev" , "inprove java" , programmer1 ,10, "Whaterever");
        openSource1.addMember(programmer2);
        //System.out.println(openSource1.getRisk());


        Programmer programmer3 = new Programmer(30,"Nina");
        Programmer programmer4 = new Programmer(30,"Abel");
        ProjectMilitary military1 = new ProjectMilitary("bombex" , "bomb romania" , programmer3 , 100 , "Luni" , "ABC");
        military1.addMember(programmer4);
        //System.out.println(military1.getRisk());


        Programmer programmer5 = new Programmer(30,"Titi");
        Programmer programmer6 = new Programmer(30,"Edi");
        ProjectComercial comercial1 = new ProjectComercial("Widnows" , "Windows dev" , programmer5, 10000 , "never" , 2);
        comercial1.addMember(programmer6);
        //System.out.println(comercial1.getRisk());

        InvestmentCompany HedgeFund = new InvestmentCompany();
        HedgeFund.addProject(openSource1);
        HedgeFund.addProject(military1);
        HedgeFund.addProject(comercial1);
        System.out.println(HedgeFund.getBestInvestment());
    }

    private Project projectList[] = new Project[100];
    private int projectCounter;
    private static final int MAX_PROJECTS = 100;
    public void addProject(Project p)
    {
        if(projectCounter < MAX_PROJECTS)
        {
         projectList[projectCounter++] = p;
        }
    }
    public Project getBestInvestment()
    {
        double bestInvestmentCnt = Double.MAX_VALUE;
        Project bestProject = null;
        for(int cnt = 0 ; cnt < projectCounter ; cnt++)
        {
            Project currProject = projectList[cnt];
            if(currProject instanceof Risky)
            {
                double currRisk = ((Risky) currProject).getRisk();
                if(currRisk < bestInvestmentCnt)
                {
                    bestInvestmentCnt = currRisk;
                    bestProject = currProject;
                }
            }
        }
        return bestProject;
    }
}
