package CsBaseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Class = 0;
  public static final int ClassMember = 1;
  public static final int ClassType = 2;
  public static final int CodeBlock = 3;
  public static final int IStaticModifiableConcept = 4;
  public static final int IVisibilityModifiableConcept = 5;
  public static final int IntType = 6;
  public static final int MethodDefinition = 7;
  public static final int PrivateVisibilityModifier = 8;
  public static final int ProtectedVisibilityModifier = 9;
  public static final int PublicVisibilityModifier = 10;
  public static final int Statement = 11;
  public static final int StaticModifier = 12;
  public static final int Type = 13;
  public static final int VisibilityModifier = 14;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x250303846d664bd0L, 0xbe085e945e7502b5L);
    builder.put(0x7b67658aa448b56cL, Class);
    builder.put(0x7b67658aa449646aL, ClassMember);
    builder.put(0x7b67658aa44afc63L, ClassType);
    builder.put(0x7b67658aa44a6d7eL, CodeBlock);
    builder.put(0x7b67658aa44b7605L, IStaticModifiableConcept);
    builder.put(0x7b67658aa449646eL, IVisibilityModifiableConcept);
    builder.put(0x7b67658aa44a6ca9L, IntType);
    builder.put(0x7b67658aa44a6ca4L, MethodDefinition);
    builder.put(0x7b67658aa44964b4L, PrivateVisibilityModifier);
    builder.put(0x7b67658aa44964bbL, ProtectedVisibilityModifier);
    builder.put(0x7b67658aa44964a5L, PublicVisibilityModifier);
    builder.put(0x7b67658aa44a6d82L, Statement);
    builder.put(0x7b67658aa44b75f6L, StaticModifier);
    builder.put(0x7b67658aa44a6ca5L, Type);
    builder.put(0x7b67658aa44964a4L, VisibilityModifier);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
