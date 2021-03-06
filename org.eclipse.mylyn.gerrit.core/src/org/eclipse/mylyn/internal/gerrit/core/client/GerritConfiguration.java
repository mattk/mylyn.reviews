/*******************************************************************************
 * Copyright (c) 2011 SAP and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sascha Scholz (SAP) - initial API and implementation
 *     Tasktop Technologies - improvements
 *******************************************************************************/

package org.eclipse.mylyn.internal.gerrit.core.client;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.mylyn.internal.gerrit.core.client.compat.GerritConfigX;

import com.google.gerrit.reviewdb.Account;
import com.google.gerrit.reviewdb.Project;

/**
 * @author Sascha Scholz
 * @author Steffen Pingel
 */
public final class GerritConfiguration {

	private GerritConfigX gerritConfig;

	private List<Project> projects;

	private Account account;

	GerritConfiguration() {
		// no-args constructor needed by gson	
	}

	public GerritConfiguration(GerritConfigX gerritConfig, List<Project> projects, Account account) {
		Assert.isNotNull(gerritConfig, "gerritConfig must not be null");
		Assert.isNotNull(projects, "projects must not be null");
		this.gerritConfig = gerritConfig;
		this.projects = projects;
		this.account = account;
	}

	/**
	 * @return the Gerrit configuration instance, never null
	 */
	public GerritConfigX getGerritConfig() {
		return gerritConfig;
	}

	/**
	 * @return the list of visible Gerrit projects, never null
	 */
	public List<Project> getProjects() {
		if (projects != null) {
			return projects;
		} else {
			return Collections.emptyList();
		}
	}

	/**
	 * @return the account instance, null if not authenticated
	 */
	public Account getAccount() {
		return account;
	}

}
