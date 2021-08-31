// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyManagerGrpc.proto

package br.com.zupacademy.achiley;

/**
 * Protobuf enum {@code br.com.zupacademy.achiley.TipoDeChaveEnum}
 */
public enum TipoDeChaveEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNRECOGNIZED_KEY = 0;</code>
   */
  UNRECOGNIZED_KEY(0),
  /**
   * <code>CPF = 1;</code>
   */
  CPF(1),
  /**
   * <code>PHONE = 2;</code>
   */
  PHONE(2),
  /**
   * <code>EMAIL = 3;</code>
   */
  EMAIL(3),
  /**
   * <code>RANDOM = 4;</code>
   */
  RANDOM(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNRECOGNIZED_KEY = 0;</code>
   */
  public static final int UNRECOGNIZED_KEY_VALUE = 0;
  /**
   * <code>CPF = 1;</code>
   */
  public static final int CPF_VALUE = 1;
  /**
   * <code>PHONE = 2;</code>
   */
  public static final int PHONE_VALUE = 2;
  /**
   * <code>EMAIL = 3;</code>
   */
  public static final int EMAIL_VALUE = 3;
  /**
   * <code>RANDOM = 4;</code>
   */
  public static final int RANDOM_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TipoDeChaveEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TipoDeChaveEnum forNumber(int value) {
    switch (value) {
      case 0: return UNRECOGNIZED_KEY;
      case 1: return CPF;
      case 2: return PHONE;
      case 3: return EMAIL;
      case 4: return RANDOM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TipoDeChaveEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TipoDeChaveEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TipoDeChaveEnum>() {
          public TipoDeChaveEnum findValueByNumber(int number) {
            return TipoDeChaveEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return br.com.zupacademy.achiley.KeyManagerGrpc.getDescriptor().getEnumTypes().get(0);
  }

  private static final TipoDeChaveEnum[] VALUES = values();

  public static TipoDeChaveEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TipoDeChaveEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:br.com.zupacademy.achiley.TipoDeChaveEnum)
}

