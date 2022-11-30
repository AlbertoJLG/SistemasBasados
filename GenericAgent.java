package examples.behaviours;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import clips.market;
import clips.persons;
import clips.prodcust;
import CLIPSJNI.*;

environment clips;

private class main extends CLIPSJNI {
  initcomponents();clips=new environment();

  load("CLIPSJNI.jar");
}

  public class GenericAgent extends Agent {

    protected void setup() {
      System.out.println("Agent " + getLocalName() + " started.");
      addBehaviour(new MyGenericBehaviour());
    }

    private class MyGenericBehaviour extends Behaviour {

    public class market {
      clips = new environment();
      clips.load("persons.clp");
      clips.load("run.clp");
      clips.load("reset.clp");
      clips.load("run.clp");
    }

    public class persons {
      clips=new environment();
      clips.load("run-persons.clp");
      clips.reset();
      clips.run();
    }

    public class prodcust {
      clips=new environment();
      clips.load("run-prodcust.clp");
      clips.run();
    }
      // int cont=0;

      /*
       * public void action() {
       * System.out.println("Agent's action method is executed");
       * cont+=1;
       * }
       * 
       * public boolean done() {
       * if (cont == 20)
       * return true;
       * else
       * return false;
       * }
       * 
       * public int onEnd() {
       * myAgent.doDelete();
       * return super.onEnd();
       * }
       */
    } // END of inner class ...Behaviour
  }
}}}
