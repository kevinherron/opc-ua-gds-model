package com.digitalpetri.opcua.gds;

import com.digitalpetri.opcua.gds.types.ApplicationRecordDataType;
import org.eclipse.milo.opcua.sdk.core.dtd.BinaryDataTypeCodec;
import org.eclipse.milo.opcua.sdk.core.dtd.BinaryDataTypeDictionary;
import org.eclipse.milo.opcua.sdk.core.dtd.DataTypeDictionaryInitializer;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.types.DataTypeDictionary;

public class BinaryDataTypeDictionaryInitializer extends DataTypeDictionaryInitializer {
  @Override
  protected void initializeStructs(
      NamespaceTable namespaceTable, DataTypeDictionary binaryDictionary) throws Exception {
    binaryDictionary.registerType(
        new BinaryDataTypeDictionary.BinaryType(
            "1:ApplicationRecordDataType",
            ApplicationRecordDataType.TYPE_ID.toNodeIdOrThrow(namespaceTable),
            ApplicationRecordDataType.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
            BinaryDataTypeCodec.from(new ApplicationRecordDataType.Codec())));
  }
}
