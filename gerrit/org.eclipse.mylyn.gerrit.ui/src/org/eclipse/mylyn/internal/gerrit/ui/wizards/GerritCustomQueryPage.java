/*********************************************************************
 * Copyright (c) 2010 Sony Ericsson/ST Ericsson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Sony Ericsson/ST Ericsson - initial API and implementation
 *********************************************************************/
package org.eclipse.mylyn.internal.gerrit.ui.wizards;

import org.eclipse.mylyn.internal.gerrit.core.GerritQuery;
import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.ui.wizards.AbstractRepositoryQueryPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author Mikael Kober
 * @author Thomas Westling
 */
public class GerritCustomQueryPage extends AbstractRepositoryQueryPage {

	private final IRepositoryQuery query;

	private Button myOpenChangesButton;

	private Button allOpenChangesButton;

	private Text titleText;

	/**
	 * Constructor.
	 * 
	 * @param repository
	 * @param pageName
	 * @param query
	 */
	public GerritCustomQueryPage(TaskRepository repository, String pageName, IRepositoryQuery query) {
		super(pageName, repository, query);
		this.query = query;
		setDescription("Enter title and type of the query.");
	}

	public void createControl(Composite parent) {
		Composite control = new Composite(parent, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_BOTH);
		control.setLayoutData(gd);
		GridLayout layout = new GridLayout(3, false);
		control.setLayout(layout);

		Label titleLabel = new Label(control, SWT.NONE);
		titleLabel.setText("Query Title :");

		titleText = new Text(control, SWT.BORDER);
		GridData gd2 = new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL);
		gd2.horizontalSpan = 2;
		titleText.setLayoutData(gd2);
		titleText.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				// ignore
			}

			public void keyReleased(KeyEvent e) {
				getContainer().updateButtons();
			}
		});

		Label typeLabel = new Label(control, SWT.NONE);
		typeLabel.setText("Query type :");
		// radio button to select query type
		myOpenChangesButton = new Button(control, SWT.RADIO);
		myOpenChangesButton.setText("My open changes");

		allOpenChangesButton = new Button(control, SWT.RADIO);
		allOpenChangesButton.setText("All open changes");

		if (query != null) {
			titleText.setText(query.getSummary());
			if (GerritQuery.MY_OPEN_CHANGES.equals(query.getAttribute(GerritQuery.TYPE))) {
				myOpenChangesButton.setSelection(true);
			} else {
				allOpenChangesButton.setSelection(true);
			}
		}

		setControl(control);
	}

	@Override
	public boolean isPageComplete() {
		return (titleText != null && titleText.getText().length() > 0);
	}

	@Override
	public void applyTo(IRepositoryQuery query) {
		// TODO: set URL ????
		// query.setUrl(getQueryUrl());
		query.setSummary(getTitleText());
		query.setAttribute(GerritQuery.TYPE, myOpenChangesButton.getSelection() ? GerritQuery.MY_OPEN_CHANGES
				: GerritQuery.ALL_OPEN_CHANGES);
	}

	private String getTitleText() {
		return (titleText != null) ? titleText.getText() : "<search>";
	}

	@Override
	public String getQueryTitle() {
		return "Gerrit Query";
	}

}