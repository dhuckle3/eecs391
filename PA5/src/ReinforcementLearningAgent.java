import java.util.Map;

import edu.cwru.SimpleRTS.action.Action;
import edu.cwru.SimpleRTS.agent.Agent;
import edu.cwru.SimpleRTS.environment.State.StateView;


public class ReinforcementLearningAgent extends Agent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 52129372962241714L;

	protected ReinforcementLearningAgent(int playernum) {
		super(playernum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<Integer, Action> initialStep(StateView arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Action> middleStep(StateView arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void terminalStep(StateView arg0) {
		// TODO Auto-generated method stub		
	}

}
