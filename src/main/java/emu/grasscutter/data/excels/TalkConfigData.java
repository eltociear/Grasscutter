package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.talk.TalkExec;
import lombok.*;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@ResourceType(name = "TalkExcelConfigData.json")
@EqualsAndHashCode(callSuper=false)
@Data
public final class TalkConfigData extends GameResource {
    @SerializedName(value="id", alternate={"_id"})
    private int id;
    @SerializedName(value="finishExec", alternate={"_finishExec"})
    private List<TalkExecParam> finishExec;
    @SerializedName(value="questId", alternate={"_questId"})
    private int questId;

    @Data
    public static class TalkExecParam {
        @SerializedName(value="type", alternate={"_type"})
        private TalkExec type;
        @SerializedName(value="param", alternate={"_param"})
        private String[] param;
    }
}
