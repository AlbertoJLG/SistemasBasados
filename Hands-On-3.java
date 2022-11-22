import clips.market;
import clips.persons;
import clips.prodcust;
import CLIPSJNI.*;

environment clips;

public class main()
{
        initcomponents();
        clips = new environment();
        load("CLIPSJNI.jar");
    }

    public class market {
    initcomponents();clips=new environment();clips.load("persons.clp");clips.load("run.clp");clips.reset();clips.run();
    }

    public class persons {
    initcomponents();clips=new environment();clips.load("run-persons.clp");clips.reset();clips.run();
    }

    public class prodcust {
    initcomponents();clips=new environment();clips.load("run-prodcust.clp");clips.run();
}
