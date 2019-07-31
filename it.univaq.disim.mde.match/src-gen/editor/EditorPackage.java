/**
 */
package editor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see editor.EditorFactory
 * @model kind="package"
 * @generated
 */
public interface EditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "editor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.univaq.it/editor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "editor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EditorPackage eINSTANCE = editor.impl.EditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link editor.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.impl.NamedElementImpl
	 * @see editor.impl.EditorPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link editor.impl.EditorSelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.impl.EditorSelectorImpl
	 * @see editor.impl.EditorPackageImpl#getEditorSelector()
	 * @generated
	 */
	int EDITOR_SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_SELECTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_SELECTOR__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_SELECTOR__EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_SELECTOR__CONTEXTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Formulas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_SELECTOR__FORMULAS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_SELECTOR__EDITORS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_SELECTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_SELECTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editor.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.impl.EventImpl
	 * @see editor.impl.EditorPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_POSITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editor.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.impl.ActionImpl
	 * @see editor.impl.EditorPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__CONTEXT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EVENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editor.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.impl.ContextImpl
	 * @see editor.impl.EditorPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__COMPOSED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Of Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NUMBER_OF_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interaction Positions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__INTERACTION_POSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__EDITORS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editor.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.impl.PropertyImpl
	 * @see editor.impl.EditorPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Calculated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_CALCULATED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__FORMULA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editor.impl.InteractionPositionImpl <em>Interaction Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.impl.InteractionPositionImpl
	 * @see editor.impl.EditorPackageImpl#getInteractionPosition()
	 * @generated
	 */
	int INTERACTION_POSITION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_POSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_POSITION__ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_POSITION__POSITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_POSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interaction Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_POSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editor.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.impl.FormulaImpl
	 * @see editor.impl.EditorPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__OPERATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editor.impl.EditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.impl.EditorImpl
	 * @see editor.impl.EditorPackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link editor.PropertyTypes <em>Property Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see editor.PropertyTypes
	 * @see editor.impl.EditorPackageImpl#getPropertyTypes()
	 * @generated
	 */
	int PROPERTY_TYPES = 9;

	/**
	 * Returns the meta object for class '{@link editor.EditorSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see editor.EditorSelector
	 * @generated
	 */
	EClass getEditorSelector();

	/**
	 * Returns the meta object for the containment reference list '{@link editor.EditorSelector#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see editor.EditorSelector#getActions()
	 * @see #getEditorSelector()
	 * @generated
	 */
	EReference getEditorSelector_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link editor.EditorSelector#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see editor.EditorSelector#getEvents()
	 * @see #getEditorSelector()
	 * @generated
	 */
	EReference getEditorSelector_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link editor.EditorSelector#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see editor.EditorSelector#getContexts()
	 * @see #getEditorSelector()
	 * @generated
	 */
	EReference getEditorSelector_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link editor.EditorSelector#getFormulas <em>Formulas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formulas</em>'.
	 * @see editor.EditorSelector#getFormulas()
	 * @see #getEditorSelector()
	 * @generated
	 */
	EReference getEditorSelector_Formulas();

	/**
	 * Returns the meta object for the containment reference list '{@link editor.EditorSelector#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editors</em>'.
	 * @see editor.EditorSelector#getEditors()
	 * @see #getEditorSelector()
	 * @generated
	 */
	EReference getEditorSelector_Editors();

	/**
	 * Returns the meta object for class '{@link editor.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see editor.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link editor.Event#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see editor.Event#getType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Type();

	/**
	 * Returns the meta object for the reference '{@link editor.Event#getEventPosition <em>Event Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Position</em>'.
	 * @see editor.Event#getEventPosition()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_EventPosition();

	/**
	 * Returns the meta object for the reference '{@link editor.Event#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see editor.Event#getContext()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Context();

	/**
	 * Returns the meta object for class '{@link editor.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see editor.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link editor.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see editor.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for the reference '{@link editor.Action#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see editor.Action#getContext()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Context();

	/**
	 * Returns the meta object for the reference '{@link editor.Action#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see editor.Action#getEvent()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Event();

	/**
	 * Returns the meta object for class '{@link editor.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see editor.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link editor.Context#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see editor.Context#getProperties()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Properties();

	/**
	 * Returns the meta object for the attribute '{@link editor.Context#isComposed <em>Composed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composed</em>'.
	 * @see editor.Context#isComposed()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Composed();

	/**
	 * Returns the meta object for the attribute '{@link editor.Context#getNumberOfElements <em>Number Of Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Elements</em>'.
	 * @see editor.Context#getNumberOfElements()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_NumberOfElements();

	/**
	 * Returns the meta object for the reference list '{@link editor.Context#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see editor.Context#getComponents()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link editor.Context#getInteractionPositions <em>Interaction Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Positions</em>'.
	 * @see editor.Context#getInteractionPositions()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_InteractionPositions();

	/**
	 * Returns the meta object for the reference list '{@link editor.Context#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Editors</em>'.
	 * @see editor.Context#getEditors()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Editors();

	/**
	 * Returns the meta object for class '{@link editor.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see editor.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link editor.Property#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see editor.Property#getDataType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_DataType();

	/**
	 * Returns the meta object for the attribute '{@link editor.Property#isIsCalculated <em>Is Calculated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Calculated</em>'.
	 * @see editor.Property#isIsCalculated()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsCalculated();

	/**
	 * Returns the meta object for the reference list '{@link editor.Property#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Formula</em>'.
	 * @see editor.Property#getFormula()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Formula();

	/**
	 * Returns the meta object for class '{@link editor.InteractionPosition <em>Interaction Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Position</em>'.
	 * @see editor.InteractionPosition
	 * @generated
	 */
	EClass getInteractionPosition();

	/**
	 * Returns the meta object for the attribute '{@link editor.InteractionPosition#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see editor.InteractionPosition#getElement()
	 * @see #getInteractionPosition()
	 * @generated
	 */
	EAttribute getInteractionPosition_Element();

	/**
	 * Returns the meta object for the attribute '{@link editor.InteractionPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see editor.InteractionPosition#getPosition()
	 * @see #getInteractionPosition()
	 * @generated
	 */
	EAttribute getInteractionPosition_Position();

	/**
	 * Returns the meta object for class '{@link editor.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see editor.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link editor.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see editor.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link editor.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see editor.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the attribute '{@link editor.Formula#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see editor.Formula#getOperation()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_Operation();

	/**
	 * Returns the meta object for the reference list '{@link editor.Formula#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see editor.Formula#getVariables()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Variables();

	/**
	 * Returns the meta object for class '{@link editor.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see editor.Editor
	 * @generated
	 */
	EClass getEditor();

	/**
	 * Returns the meta object for enum '{@link editor.PropertyTypes <em>Property Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Types</em>'.
	 * @see editor.PropertyTypes
	 * @generated
	 */
	EEnum getPropertyTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EditorFactory getEditorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link editor.impl.EditorSelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.impl.EditorSelectorImpl
		 * @see editor.impl.EditorPackageImpl#getEditorSelector()
		 * @generated
		 */
		EClass EDITOR_SELECTOR = eINSTANCE.getEditorSelector();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR_SELECTOR__ACTIONS = eINSTANCE.getEditorSelector_Actions();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR_SELECTOR__EVENTS = eINSTANCE.getEditorSelector_Events();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR_SELECTOR__CONTEXTS = eINSTANCE.getEditorSelector_Contexts();

		/**
		 * The meta object literal for the '<em><b>Formulas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR_SELECTOR__FORMULAS = eINSTANCE.getEditorSelector_Formulas();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR_SELECTOR__EDITORS = eINSTANCE.getEditorSelector_Editors();

		/**
		 * The meta object literal for the '{@link editor.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.impl.EventImpl
		 * @see editor.impl.EditorPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TYPE = eINSTANCE.getEvent_Type();

		/**
		 * The meta object literal for the '<em><b>Event Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__EVENT_POSITION = eINSTANCE.getEvent_EventPosition();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__CONTEXT = eINSTANCE.getEvent_Context();

		/**
		 * The meta object literal for the '{@link editor.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.impl.ActionImpl
		 * @see editor.impl.EditorPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__CONTEXT = eINSTANCE.getAction_Context();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__EVENT = eINSTANCE.getAction_Event();

		/**
		 * The meta object literal for the '{@link editor.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.impl.ContextImpl
		 * @see editor.impl.EditorPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PROPERTIES = eINSTANCE.getContext_Properties();

		/**
		 * The meta object literal for the '<em><b>Composed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__COMPOSED = eINSTANCE.getContext_Composed();

		/**
		 * The meta object literal for the '<em><b>Number Of Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NUMBER_OF_ELEMENTS = eINSTANCE.getContext_NumberOfElements();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__COMPONENTS = eINSTANCE.getContext_Components();

		/**
		 * The meta object literal for the '<em><b>Interaction Positions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__INTERACTION_POSITIONS = eINSTANCE.getContext_InteractionPositions();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__EDITORS = eINSTANCE.getContext_Editors();

		/**
		 * The meta object literal for the '{@link editor.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.impl.PropertyImpl
		 * @see editor.impl.EditorPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__DATA_TYPE = eINSTANCE.getProperty_DataType();

		/**
		 * The meta object literal for the '<em><b>Is Calculated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_CALCULATED = eINSTANCE.getProperty_IsCalculated();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__FORMULA = eINSTANCE.getProperty_Formula();

		/**
		 * The meta object literal for the '{@link editor.impl.InteractionPositionImpl <em>Interaction Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.impl.InteractionPositionImpl
		 * @see editor.impl.EditorPackageImpl#getInteractionPosition()
		 * @generated
		 */
		EClass INTERACTION_POSITION = eINSTANCE.getInteractionPosition();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_POSITION__ELEMENT = eINSTANCE.getInteractionPosition_Element();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_POSITION__POSITION = eINSTANCE.getInteractionPosition_Position();

		/**
		 * The meta object literal for the '{@link editor.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.impl.NamedElementImpl
		 * @see editor.impl.EditorPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link editor.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.impl.FormulaImpl
		 * @see editor.impl.EditorPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__OPERATION = eINSTANCE.getFormula_Operation();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__VARIABLES = eINSTANCE.getFormula_Variables();

		/**
		 * The meta object literal for the '{@link editor.impl.EditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.impl.EditorImpl
		 * @see editor.impl.EditorPackageImpl#getEditor()
		 * @generated
		 */
		EClass EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '{@link editor.PropertyTypes <em>Property Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see editor.PropertyTypes
		 * @see editor.impl.EditorPackageImpl#getPropertyTypes()
		 * @generated
		 */
		EEnum PROPERTY_TYPES = eINSTANCE.getPropertyTypes();

	}

} //EditorPackage
