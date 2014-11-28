/*
* generated by Xtext
*/
package org.eclipse.emf.eson.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class EFactoryGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class FactoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Factory");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEpackagesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEpackagesPackageImportParserRuleCall_0_0 = (RuleCall)cEpackagesAssignment_0.eContents().get(0);
		private final Assignment cAnnotationsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnnotationsAnnotationParserRuleCall_1_0 = (RuleCall)cAnnotationsAssignment_1.eContents().get(0);
		private final Assignment cRootAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRootNewObjectParserRuleCall_2_0 = (RuleCall)cRootAssignment_2.eContents().get(0);
		
		//Factory:
		//	epackages+=PackageImport* annotations+=Annotation* root=NewObject;
		public ParserRule getRule() { return rule; }

		//epackages+=PackageImport* annotations+=Annotation* root=NewObject
		public Group getGroup() { return cGroup; }

		//epackages+=PackageImport*
		public Assignment getEpackagesAssignment_0() { return cEpackagesAssignment_0; }

		//PackageImport
		public RuleCall getEpackagesPackageImportParserRuleCall_0_0() { return cEpackagesPackageImportParserRuleCall_0_0; }

		//annotations+=Annotation*
		public Assignment getAnnotationsAssignment_1() { return cAnnotationsAssignment_1; }

		//Annotation
		public RuleCall getAnnotationsAnnotationParserRuleCall_1_0() { return cAnnotationsAnnotationParserRuleCall_1_0; }

		//root=NewObject
		public Assignment getRootAssignment_2() { return cRootAssignment_2; }

		//NewObject
		public RuleCall getRootNewObjectParserRuleCall_2_0() { return cRootNewObjectParserRuleCall_2_0; }
	}

	public class PackageImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackageImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEPackageEPackageCrossReference_1_0 = (CrossReference)cEPackageAssignment_1.eContents().get(0);
		private final RuleCall cEPackageEPackageQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cEPackageEPackageCrossReference_1_0.eContents().get(1);
		private final Keyword cFullStopAsteriskKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//PackageImport: // TODO maybe we'll rename this 'use' to 'import' later (not short term, as it's in use)
		//	"use" ePackage=[ecore::EPackage|QualifiedName] ".*";
		public ParserRule getRule() { return rule; }

		//// TODO maybe we'll rename this 'use' to 'import' later (not short term, as it's in use)
		//"use" ePackage=[ecore::EPackage|QualifiedName] ".*"
		public Group getGroup() { return cGroup; }

		//// TODO maybe we'll rename this 'use' to 'import' later (not short term, as it's in use)
		//"use"
		public Keyword getUseKeyword_0() { return cUseKeyword_0; }

		//ePackage=[ecore::EPackage|QualifiedName]
		public Assignment getEPackageAssignment_1() { return cEPackageAssignment_1; }

		//[ecore::EPackage|QualifiedName]
		public CrossReference getEPackageEPackageCrossReference_1_0() { return cEPackageEPackageCrossReference_1_0; }

		//QualifiedName
		public RuleCall getEPackageEPackageQualifiedNameParserRuleCall_1_0_1() { return cEPackageEPackageQualifiedNameParserRuleCall_1_0_1; }

		//".*"
		public Keyword getFullStopAsteriskKeyword_2() { return cFullStopAsteriskKeyword_2; }
	}

	public class AnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Annotation");
		private final RuleCall cCustomNameMappingParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// TODO like the *.Xtext grammar itself does, support namespace and package name based (try the 'import' above!) + maybe support an "as" syntax
		//Annotation:
		//	CustomNameMapping;
		public ParserRule getRule() { return rule; }

		//CustomNameMapping
		public RuleCall getCustomNameMappingParserRuleCall() { return cCustomNameMappingParserRuleCall; }
	}

	public class CustomNameMappingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CustomNameMapping");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEClassAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEClassEClassCrossReference_2_0 = (CrossReference)cEClassAssignment_2.eContents().get(0);
		private final RuleCall cEClassEClassQualifiedNameParserRuleCall_2_0_1 = (RuleCall)cEClassEClassCrossReference_2_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameFeatureAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cNameFeatureEAttributeCrossReference_4_0 = (CrossReference)cNameFeatureAssignment_4.eContents().get(0);
		private final RuleCall cNameFeatureEAttributeIDTerminalRuleCall_4_0_1 = (RuleCall)cNameFeatureEAttributeCrossReference_4_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//// TODO further consider if name mapping is best put in-line into objects.. it would have to repeat in every file..
		//// logically this rather belongs into an external mapping, like HUTN's Configuration (HutnConfig), or even better directly into an Xcore as annotations 
		//CustomNameMapping:
		//	"@Name" "{" eClass=[ecore::EClass|QualifiedName] "=" nameFeature=[ecore::EAttribute] "}";
		public ParserRule getRule() { return rule; }

		//"@Name" "{" eClass=[ecore::EClass|QualifiedName] "=" nameFeature=[ecore::EAttribute] "}"
		public Group getGroup() { return cGroup; }

		//"@Name"
		public Keyword getNameKeyword_0() { return cNameKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//eClass=[ecore::EClass|QualifiedName]
		public Assignment getEClassAssignment_2() { return cEClassAssignment_2; }

		//[ecore::EClass|QualifiedName]
		public CrossReference getEClassEClassCrossReference_2_0() { return cEClassEClassCrossReference_2_0; }

		//QualifiedName
		public RuleCall getEClassEClassQualifiedNameParserRuleCall_2_0_1() { return cEClassEClassQualifiedNameParserRuleCall_2_0_1; }

		//"="
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }

		//nameFeature=[ecore::EAttribute]
		public Assignment getNameFeatureAssignment_4() { return cNameFeatureAssignment_4; }

		//[ecore::EAttribute]
		public CrossReference getNameFeatureEAttributeCrossReference_4_0() { return cNameFeatureEAttributeCrossReference_4_0; }

		//ID
		public RuleCall getNameFeatureEAttributeIDTerminalRuleCall_4_0_1() { return cNameFeatureEAttributeIDTerminalRuleCall_4_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEFeatureEStructuralFeatureCrossReference_0_0 = (CrossReference)cEFeatureAssignment_0.eContents().get(0);
		private final RuleCall cEFeatureEStructuralFeatureIDTerminalRuleCall_0_0_1 = (RuleCall)cEFeatureEStructuralFeatureCrossReference_0_0.eContents().get(1);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Feature:
		//	eFeature=[ecore::EStructuralFeature] ":" value=Value?;
		public ParserRule getRule() { return rule; }

		//eFeature=[ecore::EStructuralFeature] ":" value=Value?
		public Group getGroup() { return cGroup; }

		//eFeature=[ecore::EStructuralFeature]
		public Assignment getEFeatureAssignment_0() { return cEFeatureAssignment_0; }

		//[ecore::EStructuralFeature]
		public CrossReference getEFeatureEStructuralFeatureCrossReference_0_0() { return cEFeatureEStructuralFeatureCrossReference_0_0; }

		//ID
		public RuleCall getEFeatureEStructuralFeatureIDTerminalRuleCall_0_0_1() { return cEFeatureEStructuralFeatureIDTerminalRuleCall_0_0_1; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//value=Value?
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//Value
		public RuleCall getValueValueParserRuleCall_2_0() { return cValueValueParserRuleCall_2_0; }
	}

	public class NewObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NewObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEClassAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEClassEClassCrossReference_0_0 = (CrossReference)cEClassAssignment_0.eContents().get(0);
		private final RuleCall cEClassEClassQualifiedNameParserRuleCall_0_0_1 = (RuleCall)cEClassEClassCrossReference_0_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFeaturesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFeaturesFeatureParserRuleCall_3_0 = (RuleCall)cFeaturesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//// value isn't really optional semantically of course
		//// but because it may be missing while typing, this works out much better in practice like this
		//// the EFactoryJavaValidator flags it up if it's really missing
		//// without this, there are confusing parsing errors, the proposal provider doesn't work as it should, etc.
		//NewObject:
		//	eClass=[ecore::EClass|QualifiedName] name=ID? "{" features+=Feature* "}";
		public ParserRule getRule() { return rule; }

		//eClass=[ecore::EClass|QualifiedName] name=ID? "{" features+=Feature* "}"
		public Group getGroup() { return cGroup; }

		//eClass=[ecore::EClass|QualifiedName]
		public Assignment getEClassAssignment_0() { return cEClassAssignment_0; }

		//[ecore::EClass|QualifiedName]
		public CrossReference getEClassEClassCrossReference_0_0() { return cEClassEClassCrossReference_0_0; }

		//QualifiedName
		public RuleCall getEClassEClassQualifiedNameParserRuleCall_0_0_1() { return cEClassEClassQualifiedNameParserRuleCall_0_0_1; }

		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_3() { return cFeaturesAssignment_3; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_3_0() { return cFeaturesFeatureParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMultiValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAttributeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cContainmentParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cReferenceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Value: // The two (!) Syntactic Predicates => are needed here to solve "Decision can match input such as "RULE_ID '.' RULE_ID {RULE_STRING..RULE_DATE, '}', '['..'false'}" using multiple alternatives: 3, 4"
		//	MultiValue | Attribute | => Containment | => Reference;
		public ParserRule getRule() { return rule; }

		//// The two (!) Syntactic Predicates => are needed here to solve "Decision can match input such as "RULE_ID '.' RULE_ID {RULE_STRING..RULE_DATE, '}', '['..'false'}" using multiple alternatives: 3, 4"
		//MultiValue | Attribute | => Containment | => Reference
		public Alternatives getAlternatives() { return cAlternatives; }

		//// The two (!) Syntactic Predicates => are needed here to solve "Decision can match input such as "RULE_ID '.' RULE_ID {RULE_STRING..RULE_DATE, '}', '['..'false'}" using multiple alternatives: 3, 4"
		//MultiValue
		public RuleCall getMultiValueParserRuleCall_0() { return cMultiValueParserRuleCall_0; }

		//Attribute
		public RuleCall getAttributeParserRuleCall_1() { return cAttributeParserRuleCall_1; }

		//=> Containment
		public RuleCall getContainmentParserRuleCall_2() { return cContainmentParserRuleCall_2; }

		//=> Reference
		public RuleCall getReferenceParserRuleCall_3() { return cReferenceParserRuleCall_3; }
	}

	public class MultiValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MultiValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMultiValueAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValuesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValuesValueParserRuleCall_2_0 = (RuleCall)cValuesAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//MultiValue:
		//	{MultiValue} "[" values+=Value* "]";
		public ParserRule getRule() { return rule; }

		//{MultiValue} "[" values+=Value* "]"
		public Group getGroup() { return cGroup; }

		//{MultiValue}
		public Action getMultiValueAction_0() { return cMultiValueAction_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }

		//values+=Value*
		public Assignment getValuesAssignment_2() { return cValuesAssignment_2; }

		//Value
		public RuleCall getValuesValueParserRuleCall_2_0() { return cValuesValueParserRuleCall_2_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}

	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Reference");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cValueEObjectCrossReference_0 = (CrossReference)cValueAssignment.eContents().get(0);
		private final RuleCall cValueEObjectQualifiedNameParserRuleCall_0_1 = (RuleCall)cValueEObjectCrossReference_0.eContents().get(1);
		
		//Reference: // NOTE we ref. an EObject, and not an [NewObject].. this EObject is always the
		//// respective "real" EObject, in the derived state if its a reference to something
		//// in an EFactory resource, or a reference to an existing non-EFactory EObject, 
		//// e.g. in an integration scenario with other Xtext grammars.
		//	value=[ecore::EObject|QualifiedName];
		public ParserRule getRule() { return rule; }

		//// NOTE we ref. an EObject, and not an [NewObject].. this EObject is always the
		//// respective "real" EObject, in the derived state if its a reference to something
		//// in an EFactory resource, or a reference to an existing non-EFactory EObject, 
		//// e.g. in an integration scenario with other Xtext grammars.
		//value=[ecore::EObject|QualifiedName]
		public Assignment getValueAssignment() { return cValueAssignment; }

		//[ecore::EObject|QualifiedName]
		public CrossReference getValueEObjectCrossReference_0() { return cValueEObjectCrossReference_0; }

		//QualifiedName
		public RuleCall getValueEObjectQualifiedNameParserRuleCall_0_1() { return cValueEObjectQualifiedNameParserRuleCall_0_1; }
	}

	public class ContainmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Containment");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueNewObjectParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Containment:
		//	value=NewObject;
		public ParserRule getRule() { return rule; }

		//value=NewObject
		public Assignment getValueAssignment() { return cValueAssignment; }

		//NewObject
		public RuleCall getValueNewObjectParserRuleCall_0() { return cValueNewObjectParserRuleCall_0; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEnumAttributeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringAttributeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIntegerAttributeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cBooleanAttributeParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cDoubleAttributeParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cDateAttributeParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cNullAttributeParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//Attribute:
		//	EnumAttribute | StringAttribute | IntegerAttribute | BooleanAttribute | DoubleAttribute | DateAttribute |
		//	NullAttribute;
		public ParserRule getRule() { return rule; }

		//EnumAttribute | StringAttribute | IntegerAttribute | BooleanAttribute | DoubleAttribute | DateAttribute | NullAttribute
		public Alternatives getAlternatives() { return cAlternatives; }

		//EnumAttribute
		public RuleCall getEnumAttributeParserRuleCall_0() { return cEnumAttributeParserRuleCall_0; }

		//StringAttribute
		public RuleCall getStringAttributeParserRuleCall_1() { return cStringAttributeParserRuleCall_1; }

		//IntegerAttribute
		public RuleCall getIntegerAttributeParserRuleCall_2() { return cIntegerAttributeParserRuleCall_2; }

		//BooleanAttribute
		public RuleCall getBooleanAttributeParserRuleCall_3() { return cBooleanAttributeParserRuleCall_3; }

		//DoubleAttribute
		public RuleCall getDoubleAttributeParserRuleCall_4() { return cDoubleAttributeParserRuleCall_4; }

		//DateAttribute
		public RuleCall getDateAttributeParserRuleCall_5() { return cDateAttributeParserRuleCall_5; }

		//NullAttribute
		public RuleCall getNullAttributeParserRuleCall_6() { return cNullAttributeParserRuleCall_6; }
	}

	public class EnumAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EnumAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cValueEEnumLiteralCrossReference_1_0 = (CrossReference)cValueAssignment_1.eContents().get(0);
		private final RuleCall cValueEEnumLiteralIDTerminalRuleCall_1_0_1 = (RuleCall)cValueEEnumLiteralCrossReference_1_0.eContents().get(1);
		
		//EnumAttribute:
		//	":" value=[ecore::EEnumLiteral];
		public ParserRule getRule() { return rule; }

		//":" value=[ecore::EEnumLiteral]
		public Group getGroup() { return cGroup; }

		//":"
		public Keyword getColonKeyword_0() { return cColonKeyword_0; }

		//value=[ecore::EEnumLiteral]
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//[ecore::EEnumLiteral]
		public CrossReference getValueEEnumLiteralCrossReference_1_0() { return cValueEEnumLiteralCrossReference_1_0; }

		//ID
		public RuleCall getValueEEnumLiteralIDTerminalRuleCall_1_0_1() { return cValueEEnumLiteralIDTerminalRuleCall_1_0_1; }
	}

	public class StringAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringAttribute");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//// TODO Attribute Types should later not be hard-coded here anymore.. Grammar should be more open & generic.
		//StringAttribute:
		//	value=STRING;
		public ParserRule getRule() { return rule; }

		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}

	public class IntegerAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IntegerAttribute");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueLONGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//IntegerAttribute:
		//	value=LONG;
		public ParserRule getRule() { return rule; }

		//value=LONG
		public Assignment getValueAssignment() { return cValueAssignment; }

		//LONG
		public RuleCall getValueLONGTerminalRuleCall_0() { return cValueLONGTerminalRuleCall_0; }
	}

	public class DoubleAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DoubleAttribute");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueDOUBLETerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//DoubleAttribute:
		//	value=DOUBLE;
		public ParserRule getRule() { return rule; }

		//value=DOUBLE
		public Assignment getValueAssignment() { return cValueAssignment; }

		//DOUBLE
		public RuleCall getValueDOUBLETerminalRuleCall_0() { return cValueDOUBLETerminalRuleCall_0; }
	}

	public class DateAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DateAttribute");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueDATETerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//DateAttribute:
		//	value=DATE;
		public ParserRule getRule() { return rule; }

		//value=DATE
		public Assignment getValueAssignment() { return cValueAssignment; }

		//DATE
		public RuleCall getValueDATETerminalRuleCall_0() { return cValueDATETerminalRuleCall_0; }
	}

	public class NullAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NullAttribute");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueNULLKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		//NullAttribute:
		//	value="NULL";
		public ParserRule getRule() { return rule; }

		//value="NULL"
		public Assignment getValueAssignment() { return cValueAssignment; }

		//"NULL"
		public Keyword getValueNULLKeyword_0() { return cValueNULLKeyword_0; }
	}

	public class BooleanAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanAttribute");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueBOOLEANTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//BooleanAttribute:
		//	value=BOOLEAN;
		public ParserRule getRule() { return rule; }

		//value=BOOLEAN
		public Assignment getValueAssignment() { return cValueAssignment; }

		//BOOLEAN
		public RuleCall getValueBOOLEANTerminalRuleCall_0() { return cValueBOOLEANTerminalRuleCall_0; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cValidIDParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cValidIDParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ValidID ("." ValidID)*;
		public ParserRule getRule() { return rule; }

		//ValidID ("." ValidID)*
		public Group getGroup() { return cGroup; }

		//ValidID
		public RuleCall getValidIDParserRuleCall_0() { return cValidIDParserRuleCall_0; }

		//(=> "." ValidID)*
		public Group getGroup_1() { return cGroup_1; }

		//=> "."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ValidID
		public RuleCall getValidIDParserRuleCall_1_1() { return cValidIDParserRuleCall_1_1; }
	}

	public class ValidIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ValidID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ValidID:
		//	ID;
		public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private FactoryElements pFactory;
	private PackageImportElements pPackageImport;
	private AnnotationElements pAnnotation;
	private CustomNameMappingElements pCustomNameMapping;
	private FeatureElements pFeature;
	private NewObjectElements pNewObject;
	private ValueElements pValue;
	private MultiValueElements pMultiValue;
	private ReferenceElements pReference;
	private ContainmentElements pContainment;
	private AttributeElements pAttribute;
	private EnumAttributeElements pEnumAttribute;
	private StringAttributeElements pStringAttribute;
	private IntegerAttributeElements pIntegerAttribute;
	private DoubleAttributeElements pDoubleAttribute;
	private DateAttributeElements pDateAttribute;
	private NullAttributeElements pNullAttribute;
	private BooleanAttributeElements pBooleanAttribute;
	private QualifiedNameElements pQualifiedName;
	private ValidIDElements pValidID;
	private TerminalRule tBOOLEAN;
	private TerminalRule tLONG;
	private TerminalRule tDOUBLE;
	private TerminalRule tDATE;
	private TerminalRule tID;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public EFactoryGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.emf.eson.EFactory".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Factory:
	//	epackages+=PackageImport* annotations+=Annotation* root=NewObject;
	public FactoryElements getFactoryAccess() {
		return (pFactory != null) ? pFactory : (pFactory = new FactoryElements());
	}
	
	public ParserRule getFactoryRule() {
		return getFactoryAccess().getRule();
	}

	//PackageImport: // TODO maybe we'll rename this 'use' to 'import' later (not short term, as it's in use)
	//	"use" ePackage=[ecore::EPackage|QualifiedName] ".*";
	public PackageImportElements getPackageImportAccess() {
		return (pPackageImport != null) ? pPackageImport : (pPackageImport = new PackageImportElements());
	}
	
	public ParserRule getPackageImportRule() {
		return getPackageImportAccess().getRule();
	}

	//// TODO like the *.Xtext grammar itself does, support namespace and package name based (try the 'import' above!) + maybe support an "as" syntax
	//Annotation:
	//	CustomNameMapping;
	public AnnotationElements getAnnotationAccess() {
		return (pAnnotation != null) ? pAnnotation : (pAnnotation = new AnnotationElements());
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}

	//// TODO further consider if name mapping is best put in-line into objects.. it would have to repeat in every file..
	//// logically this rather belongs into an external mapping, like HUTN's Configuration (HutnConfig), or even better directly into an Xcore as annotations 
	//CustomNameMapping:
	//	"@Name" "{" eClass=[ecore::EClass|QualifiedName] "=" nameFeature=[ecore::EAttribute] "}";
	public CustomNameMappingElements getCustomNameMappingAccess() {
		return (pCustomNameMapping != null) ? pCustomNameMapping : (pCustomNameMapping = new CustomNameMappingElements());
	}
	
	public ParserRule getCustomNameMappingRule() {
		return getCustomNameMappingAccess().getRule();
	}

	//Feature:
	//	eFeature=[ecore::EStructuralFeature] ":" value=Value?;
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//// value isn't really optional semantically of course
	//// but because it may be missing while typing, this works out much better in practice like this
	//// the EFactoryJavaValidator flags it up if it's really missing
	//// without this, there are confusing parsing errors, the proposal provider doesn't work as it should, etc.
	//NewObject:
	//	eClass=[ecore::EClass|QualifiedName] name=ID? "{" features+=Feature* "}";
	public NewObjectElements getNewObjectAccess() {
		return (pNewObject != null) ? pNewObject : (pNewObject = new NewObjectElements());
	}
	
	public ParserRule getNewObjectRule() {
		return getNewObjectAccess().getRule();
	}

	//Value: // The two (!) Syntactic Predicates => are needed here to solve "Decision can match input such as "RULE_ID '.' RULE_ID {RULE_STRING..RULE_DATE, '}', '['..'false'}" using multiple alternatives: 3, 4"
	//	MultiValue | Attribute | => Containment | => Reference;
	public ValueElements getValueAccess() {
		return (pValue != null) ? pValue : (pValue = new ValueElements());
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//MultiValue:
	//	{MultiValue} "[" values+=Value* "]";
	public MultiValueElements getMultiValueAccess() {
		return (pMultiValue != null) ? pMultiValue : (pMultiValue = new MultiValueElements());
	}
	
	public ParserRule getMultiValueRule() {
		return getMultiValueAccess().getRule();
	}

	//Reference: // NOTE we ref. an EObject, and not an [NewObject].. this EObject is always the
	//// respective "real" EObject, in the derived state if its a reference to something
	//// in an EFactory resource, or a reference to an existing non-EFactory EObject, 
	//// e.g. in an integration scenario with other Xtext grammars.
	//	value=[ecore::EObject|QualifiedName];
	public ReferenceElements getReferenceAccess() {
		return (pReference != null) ? pReference : (pReference = new ReferenceElements());
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}

	//Containment:
	//	value=NewObject;
	public ContainmentElements getContainmentAccess() {
		return (pContainment != null) ? pContainment : (pContainment = new ContainmentElements());
	}
	
	public ParserRule getContainmentRule() {
		return getContainmentAccess().getRule();
	}

	//Attribute:
	//	EnumAttribute | StringAttribute | IntegerAttribute | BooleanAttribute | DoubleAttribute | DateAttribute |
	//	NullAttribute;
	public AttributeElements getAttributeAccess() {
		return (pAttribute != null) ? pAttribute : (pAttribute = new AttributeElements());
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//EnumAttribute:
	//	":" value=[ecore::EEnumLiteral];
	public EnumAttributeElements getEnumAttributeAccess() {
		return (pEnumAttribute != null) ? pEnumAttribute : (pEnumAttribute = new EnumAttributeElements());
	}
	
	public ParserRule getEnumAttributeRule() {
		return getEnumAttributeAccess().getRule();
	}

	//// TODO Attribute Types should later not be hard-coded here anymore.. Grammar should be more open & generic.
	//StringAttribute:
	//	value=STRING;
	public StringAttributeElements getStringAttributeAccess() {
		return (pStringAttribute != null) ? pStringAttribute : (pStringAttribute = new StringAttributeElements());
	}
	
	public ParserRule getStringAttributeRule() {
		return getStringAttributeAccess().getRule();
	}

	//IntegerAttribute:
	//	value=LONG;
	public IntegerAttributeElements getIntegerAttributeAccess() {
		return (pIntegerAttribute != null) ? pIntegerAttribute : (pIntegerAttribute = new IntegerAttributeElements());
	}
	
	public ParserRule getIntegerAttributeRule() {
		return getIntegerAttributeAccess().getRule();
	}

	//DoubleAttribute:
	//	value=DOUBLE;
	public DoubleAttributeElements getDoubleAttributeAccess() {
		return (pDoubleAttribute != null) ? pDoubleAttribute : (pDoubleAttribute = new DoubleAttributeElements());
	}
	
	public ParserRule getDoubleAttributeRule() {
		return getDoubleAttributeAccess().getRule();
	}

	//DateAttribute:
	//	value=DATE;
	public DateAttributeElements getDateAttributeAccess() {
		return (pDateAttribute != null) ? pDateAttribute : (pDateAttribute = new DateAttributeElements());
	}
	
	public ParserRule getDateAttributeRule() {
		return getDateAttributeAccess().getRule();
	}

	//NullAttribute:
	//	value="NULL";
	public NullAttributeElements getNullAttributeAccess() {
		return (pNullAttribute != null) ? pNullAttribute : (pNullAttribute = new NullAttributeElements());
	}
	
	public ParserRule getNullAttributeRule() {
		return getNullAttributeAccess().getRule();
	}

	//BooleanAttribute:
	//	value=BOOLEAN;
	public BooleanAttributeElements getBooleanAttributeAccess() {
		return (pBooleanAttribute != null) ? pBooleanAttribute : (pBooleanAttribute = new BooleanAttributeElements());
	}
	
	public ParserRule getBooleanAttributeRule() {
		return getBooleanAttributeAccess().getRule();
	}

	//QualifiedName:
	//	ValidID ("." ValidID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//ValidID:
	//	ID;
	public ValidIDElements getValidIDAccess() {
		return (pValidID != null) ? pValidID : (pValidID = new ValidIDElements());
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}

	//terminal BOOLEAN returns ecore::EBoolean:
	//	"true" | "false";
	public TerminalRule getBOOLEANRule() {
		return (tBOOLEAN != null) ? tBOOLEAN : (tBOOLEAN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "BOOLEAN"));
	} 

	//terminal LONG returns ecore::ELong:
	//	"-"? "0".."9"+;
	public TerminalRule getLONGRule() {
		return (tLONG != null) ? tLONG : (tLONG = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LONG"));
	} 

	//terminal DOUBLE returns ecore::EDouble:
	//	"-"? "0".."9"+ "." "0".."9"+;
	public TerminalRule getDOUBLERule() {
		return (tDOUBLE != null) ? tDOUBLE : (tDOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DOUBLE"));
	} 

	//// TODO Date RegExp should later not be hard-coded here anymore at all.. Grammar should be more open & generic.
	//terminal DATE returns ecore::EDate:
	//	"0".."9"+ "." "0".."9"+ "." "0".."9"+;
	public TerminalRule getDATERule() {
		return (tDATE != null) ? tDATE : (tDATE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DATE"));
	} 

	//// Due to historic reasons in a closed source an in-house product which uses ESON
	//// we need to add ',' allowed in IDs, as well as permit ID starting with digits:
	//// (NOTE: This terminal must be named 'ID' as well, not some new ID2 - unless you write a new ValueConverter for it.)
	//// PS: Order of terminals appears to matter - ID needs to come after BOOLEAN
	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_" | "," | "0".."9")+;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}