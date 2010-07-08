/*******************************************************************************
 * Copyright (c) 2010 Research Group for Industrial Software (INSO), Vienna University of Technology
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kilian Matt (Research Group for Industrial Software (INSO), Vienna University of Technology) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mylyn.reviews.ui;

import java.util.List;

import org.eclipse.mylyn.internal.tasks.core.RepositoryModel;
import org.eclipse.mylyn.reviews.core.ReviewConstants;
import org.eclipse.mylyn.reviews.ui.editors.ReviewTaskEditorPage;
import org.eclipse.mylyn.tasks.core.ITask;
import org.eclipse.mylyn.tasks.core.ITaskAttachment;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskData;
import org.eclipse.mylyn.tasks.ui.TasksUi;
import org.eclipse.mylyn.tasks.ui.editors.AbstractTaskEditorPageFactory;
import org.eclipse.mylyn.tasks.ui.editors.TaskEditor;
import org.eclipse.mylyn.tasks.ui.editors.TaskEditorInput;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.forms.editor.IFormPage;

/*
 * @author Kilian Matt
 */
public class ReviewTaskEditorPageFactory extends AbstractTaskEditorPageFactory {

	@Override
	public boolean canCreatePageFor(TaskEditorInput input) {
		ITask task = input.getTask();
		try {

			TaskData taskData = TasksUi.getTaskDataManager().getTaskData(task);
			if (taskData != null) {
				List<TaskAttribute> attributesByType = taskData
						.getAttributeMapper().getAttributesByType(taskData,
								TaskAttribute.TYPE_ATTACHMENT);
				for (TaskAttribute attribute : attributesByType) {
					ITaskAttachment taskAttachment = ((RepositoryModel)TasksUi.getRepositoryModel()).createTaskAttachment(attribute);
					taskData.getAttributeMapper().updateTaskAttachment(
							taskAttachment, attribute);
					if (taskAttachment.getFileName().equals(
							ReviewConstants.REVIEW_DATA_CONTAINER))
						return true;

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public IFormPage createPage(TaskEditor parentEditor) {
		return new ReviewTaskEditorPage(parentEditor);
	}

	@Override
	public Image getPageImage() {
		return Images.SMALL_ICON.createImage();
	}

	@Override
	public String getPageText() {
		return Messages.ReviewTaskEditorPageFactory_PageTitle;
	}

	@Override
	public int getPriority() {
		return PRIORITY_ADDITIONS;
	}

	@Override
	public String[] getConflictingIds(TaskEditorInput input) {
		return new String[] { "org.eclipse.mylyn.bugzilla.ui.pageFactory" };
	}
}
