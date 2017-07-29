package govhack.thecodefather.patentpending.data.models;

import com.google.gson.annotations.SerializedName;
import govhack.thecodefather.patentpending.data.enums.StageName;
import lombok.Getter;

/**
 * Created by andrewkevin on 29/7/17.
 */
@Getter
class StageDataModel {
  @SerializedName("stageName")
  private StageName stageName;
  @SerializedName("finished")
  private Boolean finished;
  @SerializedName("dateFinished")
  private String dateFinished;
  @SerializedName("estimatedDateOfFinish")
  private String estimatedDateOfFinish;
}