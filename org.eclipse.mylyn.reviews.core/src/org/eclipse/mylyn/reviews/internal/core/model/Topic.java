/**
 * Copyright (c) 2011 Tasktop Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Tasktop Technologies - initial API and implementation
 */
package org.eclipse.mylyn.reviews.internal.core.model;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mylyn.reviews.core.model.IComment;
import org.eclipse.mylyn.reviews.core.model.ILocation;
import org.eclipse.mylyn.reviews.core.model.IReview;
import org.eclipse.mylyn.reviews.core.model.IReviewItem;
import org.eclipse.mylyn.reviews.core.model.ITaskReference;
import org.eclipse.mylyn.reviews.core.model.ITopic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mylyn.reviews.internal.core.model.Topic#getTask <em>Task</em>}</li>
 *   <li>{@link org.eclipse.mylyn.reviews.internal.core.model.Topic#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mylyn.reviews.internal.core.model.Topic#getComments <em>Comments</em>}</li>
 *   <li>{@link org.eclipse.mylyn.reviews.internal.core.model.Topic#getReview <em>Review</em>}</li>
 *   <li>{@link org.eclipse.mylyn.reviews.internal.core.model.Topic#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mylyn.reviews.internal.core.model.Topic#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Topic extends Comment implements ITopic {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected ITaskReference task;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected ILocation location;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<IComment> comments;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected IReview review;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected IReviewItem item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Topic() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReviewsPackage.Literals.TOPIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITaskReference getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(ITaskReference newTask, NotificationChain msgs) {
		ITaskReference oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReviewsPackage.TOPIC__TASK,
					oldTask, newTask);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(ITaskReference newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject) task).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- ReviewsPackage.TOPIC__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject) newTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- ReviewsPackage.TOPIC__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReviewsPackage.TOPIC__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(ILocation newLocation, NotificationChain msgs) {
		ILocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ReviewsPackage.TOPIC__LOCATION, oldLocation, newLocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(ILocation newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- ReviewsPackage.TOPIC__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- ReviewsPackage.TOPIC__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReviewsPackage.TOPIC__LOCATION, newLocation,
					newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IComment> getComments() {
		if (comments == null) {
			comments = new EObjectResolvingEList<IComment>(IComment.class, this, ReviewsPackage.TOPIC__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReview getReview() {
		if (review != null && ((EObject) review).eIsProxy()) {
			InternalEObject oldReview = (InternalEObject) review;
			review = (IReview) eResolveProxy(oldReview);
			if (review != oldReview) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReviewsPackage.TOPIC__REVIEW, oldReview,
							review));
			}
		}
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReview basicGetReview() {
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReview(IReview newReview) {
		IReview oldReview = review;
		review = newReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReviewsPackage.TOPIC__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReviewsPackage.TOPIC__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReviewItem getItem() {
		if (item != null && ((EObject) item).eIsProxy()) {
			InternalEObject oldItem = (InternalEObject) item;
			item = (IReviewItem) eResolveProxy(oldItem);
			if (item != oldItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReviewsPackage.TOPIC__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReviewItem basicGetItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(IReviewItem newItem, NotificationChain msgs) {
		IReviewItem oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReviewsPackage.TOPIC__ITEM,
					oldItem, newItem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(IReviewItem newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject) item).eInverseRemove(this, ReviewsPackage.REVIEW_ITEM__TOPICS,
						IReviewItem.class, msgs);
			if (newItem != null)
				msgs = ((InternalEObject) newItem).eInverseAdd(this, ReviewsPackage.REVIEW_ITEM__TOPICS,
						IReviewItem.class, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReviewsPackage.TOPIC__ITEM, newItem, newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReviewsPackage.TOPIC__ITEM:
			if (item != null)
				msgs = ((InternalEObject) item).eInverseRemove(this, ReviewsPackage.REVIEW_ITEM__TOPICS,
						IReviewItem.class, msgs);
			return basicSetItem((IReviewItem) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ReviewsPackage.TOPIC__TASK:
			return basicSetTask(null, msgs);
		case ReviewsPackage.TOPIC__LOCATION:
			return basicSetLocation(null, msgs);
		case ReviewsPackage.TOPIC__ITEM:
			return basicSetItem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReviewsPackage.TOPIC__TASK:
			return getTask();
		case ReviewsPackage.TOPIC__LOCATION:
			return getLocation();
		case ReviewsPackage.TOPIC__COMMENTS:
			return getComments();
		case ReviewsPackage.TOPIC__REVIEW:
			if (resolve)
				return getReview();
			return basicGetReview();
		case ReviewsPackage.TOPIC__TITLE:
			return getTitle();
		case ReviewsPackage.TOPIC__ITEM:
			if (resolve)
				return getItem();
			return basicGetItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReviewsPackage.TOPIC__TASK:
			setTask((ITaskReference) newValue);
			return;
		case ReviewsPackage.TOPIC__LOCATION:
			setLocation((ILocation) newValue);
			return;
		case ReviewsPackage.TOPIC__COMMENTS:
			getComments().clear();
			getComments().addAll((Collection<? extends IComment>) newValue);
			return;
		case ReviewsPackage.TOPIC__REVIEW:
			setReview((IReview) newValue);
			return;
		case ReviewsPackage.TOPIC__TITLE:
			setTitle((String) newValue);
			return;
		case ReviewsPackage.TOPIC__ITEM:
			setItem((IReviewItem) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ReviewsPackage.TOPIC__TASK:
			setTask((ITaskReference) null);
			return;
		case ReviewsPackage.TOPIC__LOCATION:
			setLocation((ILocation) null);
			return;
		case ReviewsPackage.TOPIC__COMMENTS:
			getComments().clear();
			return;
		case ReviewsPackage.TOPIC__REVIEW:
			setReview((IReview) null);
			return;
		case ReviewsPackage.TOPIC__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case ReviewsPackage.TOPIC__ITEM:
			setItem((IReviewItem) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ReviewsPackage.TOPIC__TASK:
			return task != null;
		case ReviewsPackage.TOPIC__LOCATION:
			return location != null;
		case ReviewsPackage.TOPIC__COMMENTS:
			return comments != null && !comments.isEmpty();
		case ReviewsPackage.TOPIC__REVIEW:
			return review != null;
		case ReviewsPackage.TOPIC__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case ReviewsPackage.TOPIC__ITEM:
			return item != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: "); //$NON-NLS-1$
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //Topic
