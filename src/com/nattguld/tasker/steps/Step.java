package com.nattguld.tasker.steps;

/**
 * 
 * @author randqm
 *
 */

public abstract class Step {
	
	/**
	 * The step name.
	 */
	private final String name;
	
	/**
	 * Whether the step is critical or not.
	 */
	private final boolean critical;
	
	/**
	 * The current step state.
	 */
	private StepState state;
	
	
	/**
	 * Creates a new step.
	 */
	public Step() {
		this("unnamed");
	}
	
	/**
	 * Creates a new step.
	 * 
	 * @param critical Whether the step is critical or not.
	 */
	public Step(boolean critical) {
		this("unnamed", critical);
	}
	
	/**
	 * Creates a new step.
	 * 
	 * @param name The step name.
	 */
	public Step(String name) {
		this(name, true);
	}
	
	/**
	 * Creates a new step.
	 * 
	 * @param name The step name.
	 * 
	 * @param critical Whether the step is critical or not.
	 */
	public Step(String name, boolean critical) {
		this.name = name;
		this.critical = critical;
		this.state = StepState.IN_QUEUE;
	}
	
	/**
	 * Attempts to execute the step.
	 * 
	 * @return The step execution response.
	 */
	public abstract StepState execute();
	
	/**
	 * Retrieves the step name.
	 * 
	 * @return The name of the step.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Retrieves whether the step is critical or not.
	 * 
	 * @return The result.
	 */
	public boolean isCritical() {
		return critical;
	}
	
	/**
	 * Modifies the step state.
	 * 
	 * @param state The new state.
	 * 
	 * @return The step.
	 */
	public Step setState(StepState state) {
		this.state = state;
		return this;
	}
	
	/**
	 * Retrieves the current step state.
	 * 
	 * @return The state.
	 */
	public StepState getState() {
		return state;
	}

}