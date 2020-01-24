package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy extends com.codingnation.textlocal.ui.sendotp.SendOtpQ
    implements RealmObjectProxy, com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface {

    static final class SendOtpQColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long numbersIndex;
        long messageIndex;
        long senderIndex;
        long apikeyIndex;
        long timeIndex;
        long nameIndex;

        SendOtpQColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("SendOtpQ");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.numbersIndex = addColumnDetails("numbers", "numbers", objectSchemaInfo);
            this.messageIndex = addColumnDetails("message", "message", objectSchemaInfo);
            this.senderIndex = addColumnDetails("sender", "sender", objectSchemaInfo);
            this.apikeyIndex = addColumnDetails("apikey", "apikey", objectSchemaInfo);
            this.timeIndex = addColumnDetails("time", "time", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SendOtpQColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SendOtpQColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SendOtpQColumnInfo src = (SendOtpQColumnInfo) rawSrc;
            final SendOtpQColumnInfo dst = (SendOtpQColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.numbersIndex = src.numbersIndex;
            dst.messageIndex = src.messageIndex;
            dst.senderIndex = src.senderIndex;
            dst.apikeyIndex = src.apikeyIndex;
            dst.timeIndex = src.timeIndex;
            dst.nameIndex = src.nameIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SendOtpQColumnInfo columnInfo;
    private ProxyState<com.codingnation.textlocal.ui.sendotp.SendOtpQ> proxyState;

    com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SendOtpQColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.codingnation.textlocal.ui.sendotp.SendOtpQ>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$numbers() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.numbersIndex);
    }

    @Override
    public void realmSet$numbers(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numbers' to null.");
            }
            row.getTable().setString(columnInfo.numbersIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'numbers' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.numbersIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$message() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.messageIndex);
    }

    @Override
    public void realmSet$message(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'message' to null.");
            }
            row.getTable().setString(columnInfo.messageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'message' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.messageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sender() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.senderIndex);
    }

    @Override
    public void realmSet$sender(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sender' to null.");
            }
            row.getTable().setString(columnInfo.senderIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'sender' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.senderIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$apikey() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.apikeyIndex);
    }

    @Override
    public void realmSet$apikey(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'apikey' to null.");
            }
            row.getTable().setString(columnInfo.apikeyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'apikey' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.apikeyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$time() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.timeIndex);
    }

    @Override
    public void realmSet$time(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'time' to null.");
            }
            row.getTable().setString(columnInfo.timeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'time' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.timeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("SendOtpQ", 7, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("numbers", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("message", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("sender", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("apikey", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("time", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SendOtpQColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SendOtpQColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "SendOtpQ";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SendOtpQ";
    }

    @SuppressWarnings("cast")
    public static com.codingnation.textlocal.ui.sendotp.SendOtpQ createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.codingnation.textlocal.ui.sendotp.SendOtpQ obj = null;
        if (update) {
            Table table = realm.getTable(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
            SendOtpQColumnInfo columnInfo = (SendOtpQColumnInfo) realm.getSchema().getColumnInfo(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy) realm.createObjectInternal(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy) realm.createObjectInternal(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface objProxy = (com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) obj;
        if (json.has("numbers")) {
            if (json.isNull("numbers")) {
                objProxy.realmSet$numbers(null);
            } else {
                objProxy.realmSet$numbers((String) json.getString("numbers"));
            }
        }
        if (json.has("message")) {
            if (json.isNull("message")) {
                objProxy.realmSet$message(null);
            } else {
                objProxy.realmSet$message((String) json.getString("message"));
            }
        }
        if (json.has("sender")) {
            if (json.isNull("sender")) {
                objProxy.realmSet$sender(null);
            } else {
                objProxy.realmSet$sender((String) json.getString("sender"));
            }
        }
        if (json.has("apikey")) {
            if (json.isNull("apikey")) {
                objProxy.realmSet$apikey(null);
            } else {
                objProxy.realmSet$apikey((String) json.getString("apikey"));
            }
        }
        if (json.has("time")) {
            if (json.isNull("time")) {
                objProxy.realmSet$time(null);
            } else {
                objProxy.realmSet$time((String) json.getString("time"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.codingnation.textlocal.ui.sendotp.SendOtpQ createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.codingnation.textlocal.ui.sendotp.SendOtpQ obj = new com.codingnation.textlocal.ui.sendotp.SendOtpQ();
        final com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface objProxy = (com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("numbers")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$numbers((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$numbers(null);
                }
            } else if (name.equals("message")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$message((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$message(null);
                }
            } else if (name.equals("sender")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sender((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sender(null);
                }
            } else if (name.equals("apikey")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$apikey((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$apikey(null);
                }
            } else if (name.equals("time")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$time((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$time(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    private static com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class), false, Collections.<String>emptyList());
        io.realm.com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy obj = new io.realm.com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.codingnation.textlocal.ui.sendotp.SendOtpQ copyOrUpdate(Realm realm, SendOtpQColumnInfo columnInfo, com.codingnation.textlocal.ui.sendotp.SendOtpQ object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.codingnation.textlocal.ui.sendotp.SendOtpQ) cachedRealmObject;
        }

        com.codingnation.textlocal.ui.sendotp.SendOtpQ realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.codingnation.textlocal.ui.sendotp.SendOtpQ copy(Realm realm, SendOtpQColumnInfo columnInfo, com.codingnation.textlocal.ui.sendotp.SendOtpQ newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.codingnation.textlocal.ui.sendotp.SendOtpQ) cachedRealmObject;
        }

        com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface realmObjectSource = (com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) newObject;

        Table table = realm.getTable(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.numbersIndex, realmObjectSource.realmGet$numbers());
        builder.addString(columnInfo.messageIndex, realmObjectSource.realmGet$message());
        builder.addString(columnInfo.senderIndex, realmObjectSource.realmGet$sender());
        builder.addString(columnInfo.apikeyIndex, realmObjectSource.realmGet$apikey());
        builder.addString(columnInfo.timeIndex, realmObjectSource.realmGet$time());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.codingnation.textlocal.ui.sendotp.SendOtpQ object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        long tableNativePtr = table.getNativePtr();
        SendOtpQColumnInfo columnInfo = (SendOtpQColumnInfo) realm.getSchema().getColumnInfo(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$numbers = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$numbers();
        if (realmGet$numbers != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.numbersIndex, rowIndex, realmGet$numbers, false);
        }
        String realmGet$message = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.messageIndex, rowIndex, realmGet$message, false);
        }
        String realmGet$sender = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$sender();
        if (realmGet$sender != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderIndex, rowIndex, realmGet$sender, false);
        }
        String realmGet$apikey = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$apikey();
        if (realmGet$apikey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.apikeyIndex, rowIndex, realmGet$apikey, false);
        }
        String realmGet$time = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$time();
        if (realmGet$time != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeIndex, rowIndex, realmGet$time, false);
        }
        String realmGet$name = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        long tableNativePtr = table.getNativePtr();
        SendOtpQColumnInfo columnInfo = (SendOtpQColumnInfo) realm.getSchema().getColumnInfo(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.codingnation.textlocal.ui.sendotp.SendOtpQ object = null;
        while (objects.hasNext()) {
            object = (com.codingnation.textlocal.ui.sendotp.SendOtpQ) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$numbers = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$numbers();
            if (realmGet$numbers != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.numbersIndex, rowIndex, realmGet$numbers, false);
            }
            String realmGet$message = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$message();
            if (realmGet$message != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.messageIndex, rowIndex, realmGet$message, false);
            }
            String realmGet$sender = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$sender();
            if (realmGet$sender != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderIndex, rowIndex, realmGet$sender, false);
            }
            String realmGet$apikey = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$apikey();
            if (realmGet$apikey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.apikeyIndex, rowIndex, realmGet$apikey, false);
            }
            String realmGet$time = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$time();
            if (realmGet$time != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeIndex, rowIndex, realmGet$time, false);
            }
            String realmGet$name = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.codingnation.textlocal.ui.sendotp.SendOtpQ object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        long tableNativePtr = table.getNativePtr();
        SendOtpQColumnInfo columnInfo = (SendOtpQColumnInfo) realm.getSchema().getColumnInfo(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$numbers = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$numbers();
        if (realmGet$numbers != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.numbersIndex, rowIndex, realmGet$numbers, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.numbersIndex, rowIndex, false);
        }
        String realmGet$message = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.messageIndex, rowIndex, realmGet$message, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.messageIndex, rowIndex, false);
        }
        String realmGet$sender = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$sender();
        if (realmGet$sender != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderIndex, rowIndex, realmGet$sender, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderIndex, rowIndex, false);
        }
        String realmGet$apikey = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$apikey();
        if (realmGet$apikey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.apikeyIndex, rowIndex, realmGet$apikey, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.apikeyIndex, rowIndex, false);
        }
        String realmGet$time = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$time();
        if (realmGet$time != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeIndex, rowIndex, realmGet$time, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.timeIndex, rowIndex, false);
        }
        String realmGet$name = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        long tableNativePtr = table.getNativePtr();
        SendOtpQColumnInfo columnInfo = (SendOtpQColumnInfo) realm.getSchema().getColumnInfo(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.codingnation.textlocal.ui.sendotp.SendOtpQ object = null;
        while (objects.hasNext()) {
            object = (com.codingnation.textlocal.ui.sendotp.SendOtpQ) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$numbers = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$numbers();
            if (realmGet$numbers != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.numbersIndex, rowIndex, realmGet$numbers, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.numbersIndex, rowIndex, false);
            }
            String realmGet$message = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$message();
            if (realmGet$message != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.messageIndex, rowIndex, realmGet$message, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.messageIndex, rowIndex, false);
            }
            String realmGet$sender = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$sender();
            if (realmGet$sender != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderIndex, rowIndex, realmGet$sender, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderIndex, rowIndex, false);
            }
            String realmGet$apikey = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$apikey();
            if (realmGet$apikey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.apikeyIndex, rowIndex, realmGet$apikey, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.apikeyIndex, rowIndex, false);
            }
            String realmGet$time = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$time();
            if (realmGet$time != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeIndex, rowIndex, realmGet$time, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.timeIndex, rowIndex, false);
            }
            String realmGet$name = ((com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
        }
    }

    public static com.codingnation.textlocal.ui.sendotp.SendOtpQ createDetachedCopy(com.codingnation.textlocal.ui.sendotp.SendOtpQ realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.codingnation.textlocal.ui.sendotp.SendOtpQ unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.codingnation.textlocal.ui.sendotp.SendOtpQ();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.codingnation.textlocal.ui.sendotp.SendOtpQ) cachedObject.object;
            }
            unmanagedObject = (com.codingnation.textlocal.ui.sendotp.SendOtpQ) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface unmanagedCopy = (com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) unmanagedObject;
        com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface realmSource = (com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$numbers(realmSource.realmGet$numbers());
        unmanagedCopy.realmSet$message(realmSource.realmGet$message());
        unmanagedCopy.realmSet$sender(realmSource.realmGet$sender());
        unmanagedCopy.realmSet$apikey(realmSource.realmGet$apikey());
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        return unmanagedObject;
    }

    static com.codingnation.textlocal.ui.sendotp.SendOtpQ update(Realm realm, SendOtpQColumnInfo columnInfo, com.codingnation.textlocal.ui.sendotp.SendOtpQ realmObject, com.codingnation.textlocal.ui.sendotp.SendOtpQ newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface realmObjectTarget = (com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) realmObject;
        com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface realmObjectSource = (com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxyInterface) newObject;
        Table table = realm.getTable(com.codingnation.textlocal.ui.sendotp.SendOtpQ.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.numbersIndex, realmObjectSource.realmGet$numbers());
        builder.addString(columnInfo.messageIndex, realmObjectSource.realmGet$message());
        builder.addString(columnInfo.senderIndex, realmObjectSource.realmGet$sender());
        builder.addString(columnInfo.apikeyIndex, realmObjectSource.realmGet$apikey());
        builder.addString(columnInfo.timeIndex, realmObjectSource.realmGet$time());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("SendOtpQ = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numbers:");
        stringBuilder.append(realmGet$numbers());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{message:");
        stringBuilder.append(realmGet$message());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sender:");
        stringBuilder.append(realmGet$sender());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{apikey:");
        stringBuilder.append(realmGet$apikey());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{time:");
        stringBuilder.append(realmGet$time());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy aSendOtpQ = (com_codingnation_textlocal_ui_sendotp_SendOtpQRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aSendOtpQ.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSendOtpQ.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aSendOtpQ.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
