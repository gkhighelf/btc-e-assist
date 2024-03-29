package com.btc_e_assist;

public interface CheckableTask {
	boolean check();

	boolean doIfPositive();

	boolean doIfNegative();

	boolean isDeleteIfPositive();

	boolean isDeleteIfNegative();

	void doIfPositiveActionFail();

	void doIfNegativeActionFail();

	long getId();
}
