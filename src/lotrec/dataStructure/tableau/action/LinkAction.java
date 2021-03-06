package lotrec.dataStructure.tableau.action;

import java.util.Enumeration;
import lotrec.dataStructure.ParametersDescriptions;
import lotrec.dataStructure.ParametersTypes;
import lotrec.dataStructure.expression.*;
import lotrec.process.AbstractAction;
import lotrec.process.ProcessException;
import lotrec.dataStructure.tableau.*;
import lotrec.process.EventMachine;

/**
When applied, links two nodes.
@author David Fauthoux
 */
public class LinkAction extends AbstractAction {

    private SchemeVariable nodeFromScheme;
    private SchemeVariable nodeToScheme;
    private Expression relationScheme;

    /**
    Creates an action which will link two nodes.
    REMOVED : If one, only one, of the two specified nodes doesn't exist, this class will create it and will complete the returned instance set.
    User only specifies the scheme representing the nodes and this class will find it in the instance set (modifier), when <i>apply</i> method is called.
    REMOVED : <p>The eventually created node will be named with the <i>toString</i> method of <i>nodeScheme</i>
    @param nodeFromScheme the scheme representing the source node of the created edge
    @param nodeToScheme the scheme representing the destination node of the created edge
    @param relationScheme the scheme representing the expression to instance, this expression is used for the new edge
     */
    @ParametersTypes(types = {"node", "node", "relation"})
    @ParametersDescriptions(descriptions = {"The (source) node that will be linked to the other \"node\" parameter by the \"relation\" parameter. It should be already instanciated by other conditions or created by other actions",
"The (destination) node that will be linked to the first \"node\" parameter by the \"relation\" parameter. It should be also already instanciated by other conditions or created by other actions",
"The relation's expression that will label the link between the two \"node\" parameters"
})
    public LinkAction(SchemeVariable nodeFromScheme, SchemeVariable nodeToScheme, Expression relationScheme) {
        super();
        this.nodeFromScheme = nodeFromScheme;
        this.nodeToScheme = nodeToScheme;
        this.relationScheme = relationScheme;
    }

    /**
    Finds the concrete nodes in the modifier to link them, after having instanced the relation with the specified instance set.
    if one, only one, of the two nodes doesn't exist (not found in the instance set), it is created and the returned instance set is completed with its scheme.
    @param modifier the instance set used in the restriction process
    @return the instance set eventually completed with the new node scheme
     */
    @Override
    public Object apply(EventMachine em, Object modifier) {
        InstanceSet instanceSet = (InstanceSet) modifier;
        TableauNode nFrom = (TableauNode) instanceSet.get(nodeFromScheme);
        TableauNode nTo = (TableauNode) instanceSet.get(nodeToScheme);
        Expression e = relationScheme.getInstance(instanceSet);
        /* ADDED 00/12/10 */
        if (e == null) {
            throw new ProcessException(this.getClass().getSimpleName() + " in rule " + em.getWorkerName() + ":\n" +
                    "cannot apply action, cannot instanciate expression: " + relationScheme);
        }

        /*ADDED 06 10 2000*/
        if ((nFrom == null) || (nTo == null)) {
            throw new ProcessException(this.getClass().getSimpleName() + " in rule " + em.getWorkerName() + ":\n" +
                    "cannot apply without instance for nodeFrom or for nodeTo");
        }

        /*   
        If the link already existed we do nothing
         (Sahade: "If the link is already existant we do anything")
         */
        for (Enumeration enumr = nFrom.getNextEdgesEnum(); enumr.hasMoreElements();) {
            TableauEdge edge = (TableauEdge) enumr.nextElement();
            if (edge.getEndNode().equals(nTo)) {
                Expression r = edge.getRelation();
                InstanceSet newInstanceSet = relationScheme.matchWith(r, instanceSet);
                if (newInstanceSet != null) {  //nFrom.sendEvent(new LinkEvent(nFrom, LinkEvent.LINKED, edge));
                    return instanceSet;
                }
            }
        }
        TableauEdge newEdge = new TableauEdge(nFrom, nTo, e);
        nFrom.link(newEdge);
        return instanceSet;

    /*             */

    /*REMOVED 06 10 2000
    if((nFrom == null) && (nTo == null)) {
    throw new ProcessException(toString()+" : cannot apply without instance for nodeFrom nor for nodeTo");
    }
    //tous les schemas sont instancies
    if((nFrom != null) && (nTo != null)) {
    TableauEdge newEdge = new TableauEdge(nFrom, nTo, e);
    nFrom.link(newEdge);
    return instanceSet;
    }
    //cas ou le test du lien part de nodeFrom
    if(nFrom != null) {
    Tableau tableau = (Tableau)nFrom.getGraph();
    TableauNode newNode = new TableauNode();//%%nodeToScheme.toString());
    tableau.add(newNode);
    TableauEdge newEdge = new TableauEdge(nFrom, newNode, e);
    nFrom.link(newEdge);
    return instanceSet.plus(nodeToScheme, newNode);
    } else {
    //cas ou le test du lien part de nodeTo (invers)
    // nTo != null
    Tableau tableau = (Tableau)nTo.getGraph();
    TableauNode newNode = new TableauNode();//%%nodeFromScheme.toString());
    tableau.add(newNode);
    TableauEdge newEdge = new TableauEdge(newNode, nTo, e);
    newNode.link(newEdge);
    return instanceSet.plus(nodeFromScheme, newNode);
    }
     */
    }
}
