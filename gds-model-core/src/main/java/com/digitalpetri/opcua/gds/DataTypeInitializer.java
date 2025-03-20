package com.digitalpetri.opcua.gds;

import com.digitalpetri.opcua.gds.types.ApplicationRecordDataType;
import org.eclipse.milo.opcua.stack.core.NamespaceTable;
import org.eclipse.milo.opcua.stack.core.types.DataTypeManager;

public class DataTypeInitializer {

  public void initialize(NamespaceTable namespaceTable, DataTypeManager dataTypeManager) {
    try {
      registerStructCodecs(namespaceTable, dataTypeManager);
    } catch (Exception e) {
      throw new RuntimeException("DataType initialization failed", e);
    }
  }

  private void registerStructCodecs(NamespaceTable namespaceTable, DataTypeManager dataTypeManager)
      throws Exception {
    dataTypeManager.registerType(
        ApplicationRecordDataType.TYPE_ID.toNodeIdOrThrow(namespaceTable),
        new ApplicationRecordDataType.Codec(),
        ApplicationRecordDataType.BINARY_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
        ApplicationRecordDataType.XML_ENCODING_ID.toNodeIdOrThrow(namespaceTable),
        ApplicationRecordDataType.JSON_ENCODING_ID.toNodeIdOrThrow(namespaceTable));
  }
}
