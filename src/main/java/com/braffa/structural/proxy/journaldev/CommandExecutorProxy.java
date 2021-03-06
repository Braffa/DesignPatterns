package com.braffa.structural.proxy.journaldev;

public class CommandExecutorProxy implements ICommandExecutor {

	private boolean isAdmin;
	private ICommandExecutor executor;

	public CommandExecutorProxy(String user, String pwd) {
		if ("Pankaj".equals(user) && "J@urnalD$v".equals(pwd))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception(
						"rm command is not allowed for non admin Users.");
			} else {
				executor.runCommand(cmd);
			}
		}
	}
}
