//V2 版本 去 https://www.dianxiaomi.com/stat/notIndex.htm?indexType=5 拉数据
<!-- layui -->
https://blog.csdn.net/u013379553/article/details/106302723/
//http://www.86y.org/code/colorpicker/color.html
    var int = self.setInterval("method()", 1000);


function method() {
    if (0 == $(".UiPageHeader_dZl7h").length) {
        return;
    }

    /*  if (1 == $("#updatePb").length) {
          return;
      }

      var updatePb = '<span id="updatePb" class="wrapper ml-4 UiDropWrapper_LecBY focus_4qdA8" tabindex="0"><button tabindex="0" class="UiButton_5o4fr primary_y5PrC L_A+DCh hoverable_UGLSM"><!----> <div class="content_8vYKD">更新数据信息</div></button> </span>';
      $(".UiPageHeader_dZl7h").append(updatePb);

      updatePbData();

      $("#updatePb").on("click", function () {
          updatePbData();
      });*/
    updatePbData();

}

function updatePbData() {
    var countPb = 0;
    var countPbClick = 0;
    var countIndex = 0;

    if ($(".pbValueClassTd").length == 0) {

        $.each($(".scrollContainer_PF1Q0 thead tr"), function (i, item) {
            $(this).prepend('<th class="pbValueClassTH" style="width: 9rem; min-width: 9rem; max-width: 9rem; left: 0px; position: sticky; z-index: 1; right: auto;"><div class="container_RM9ce" type="text" width="9rem" sortable="sortable" sortfield="SORT_FIELD_ID" sticky="true" copyable="true" group="Parameters" headerqaid="sortById" size="L"><div class="header_3VvNy"><div class="ellipsisLines_kDWaH headerLabel_ar63T">点击费用</div> <span class="wrapper UiTooltip_abiRe"><div class="interaction_APmWh"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 16 16" class="question_Pb88d"><path fill="currentColor" d="M2 8a6 6 0 1 0 12 0A6 6 0 0 0 2 8Zm5.906 1.527c-.515 0-.848-.35-.848-.86v-.032c0-.585.317-.977.902-1.31.73-.43.918-.66.918-1.123 0-.435-.349-.741-.832-.741-.43 0-.72.199-.886.59-.156.35-.462.527-.838.527-.505 0-.827-.311-.822-.795 0-.23.054-.44.167-.644C6.027 4.462 6.923 4 8.143 4c1.627 0 2.696.849 2.696 2.154 0 .79-.37 1.337-1.16 1.794-.736.424-.876.617-.983 1.004-.124.376-.376.575-.79.575Zm.027 2.47c-.564 0-1.015-.424-1.015-.966 0-.537.451-.962 1.015-.962.559 0 1.015.425 1.015.962 0 .542-.456.967-1.015.967Z"></path></svg></div> <!----></span> <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 16 16" class="sortingIcon_+Spkq sortingIconNull_42Ean"><path fill="currentColor" d="M3.293 2.293a1 1 0 0 1 1.414 0l3 3a1 1 0 0 1-1.414 1.414L5 5.414V12a1 1 0 1 1-2 0V5.414L1.707 6.707A1 1 0 0 1 .293 5.293l3-3ZM11 10.586V4a1 1 0 1 1 2 0v6.586l1.293-1.293a1 1 0 1 1 1.414 1.414l-3 3a1 1 0 0 1-1.414 0l-3-3a1 1 0 0 1 1.414-1.414L11 10.586Z"></path></svg></div></div></th>');
        });

        $.each($(".scrollContainer_PF1Q0 thead tr"), function (i, item) {
            $(this).prepend('<th class="pbValueClassTH" style="width: 9rem; min-width: 9rem; max-width: 9rem; left: 0px; position: sticky; z-index: 1; right: auto;"><div class="container_RM9ce" type="text" width="9rem" sortable="sortable" sortfield="SORT_FIELD_ID" sticky="true" copyable="true" group="Parameters" headerqaid="sortById" size="L"><div class="header_3VvNy"><div class="ellipsisLines_kDWaH headerLabel_ar63T">RMB费用</div> <span class="wrapper UiTooltip_abiRe"><div class="interaction_APmWh"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 16 16" class="question_Pb88d"><path fill="currentColor" d="M2 8a6 6 0 1 0 12 0A6 6 0 0 0 2 8Zm5.906 1.527c-.515 0-.848-.35-.848-.86v-.032c0-.585.317-.977.902-1.31.73-.43.918-.66.918-1.123 0-.435-.349-.741-.832-.741-.43 0-.72.199-.886.59-.156.35-.462.527-.838.527-.505 0-.827-.311-.822-.795 0-.23.054-.44.167-.644C6.027 4.462 6.923 4 8.143 4c1.627 0 2.696.849 2.696 2.154 0 .79-.37 1.337-1.16 1.794-.736.424-.876.617-.983 1.004-.124.376-.376.575-.79.575Zm.027 2.47c-.564 0-1.015-.424-1.015-.966 0-.537.451-.962 1.015-.962.559 0 1.015.425 1.015.962 0 .542-.456.967-1.015.967Z"></path></svg></div> <!----></span> <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 16 16" class="sortingIcon_+Spkq sortingIconNull_42Ean"><path fill="currentColor" d="M3.293 2.293a1 1 0 0 1 1.414 0l3 3a1 1 0 0 1-1.414 1.414L5 5.414V12a1 1 0 1 1-2 0V5.414L1.707 6.707A1 1 0 0 1 .293 5.293l3-3ZM11 10.586V4a1 1 0 1 1 2 0v6.586l1.293-1.293a1 1 0 1 1 1.414 1.414l-3 3a1 1 0 0 1-1.414 0l-3-3a1 1 0 0 1 1.414-1.414L11 10.586Z"></path></svg></div></div></th>');
        });


        $.each($(".scrollContainer_PF1Q0 tbody tr"), function (i, item) {
            $(this).prepend('<td align="center" valign="middle"  class="pbValueClassTd" style="width: 6rem; min-width: 6rem; max-width: 6rem; left: 0px; position: sticky; z-index: 1; right: auto;"><div class="UiTableCell_tPYHU L_hRmSC tag_8zgf0" style="width: 6rem;"><div class="mainCellContainer_YQD8z L_hRmSC"><div class="content_xNMVR"><div class="UiTag_yZ5O8 default_I909A tag_8zgf0" content="3083700">\n' +
                '                        888888\n' +
                '                      </div> <!----> <!----></div> <!----></div></div></td>');

            $(this).prepend('<td align="center" valign="middle"  class="pbValueClassTd" style="width: 6rem; min-width: 6rem; max-width: 6rem; left: 0px; position: sticky; z-index: 1; right: auto;"><div class="UiTableCell_tPYHU L_hRmSC tag_8zgf0" style="width: 6rem;"><div class="mainCellContainer_YQD8z L_hRmSC"><div class="content_xNMVR"><div class="UiTag_yZ5O8 default_I909A tag_8zgf0" content="3083700">\n' +
                '                        0000000\n' +
                '                      </div> <!----> <!----></div> <!----></div></div></td>');

        });
    }


    $.each($(".scrollContainer_PF1Q0 tbody tr"), function (i, item) {
        var rmbPb = 0;
        var rmbPbClick = 0;

        $.each($(this).find("td"), function (i, item) {

            if (10 == i) {
                var pbValue = $(this).find(".UiBalance_hiH5g").html().trim();
                pbValue = pbValue.substr(0, pbValue.lastIndexOf(","));
                pbValue = pbValue * 0.0847;
                pbValue = pbValue.toFixed(2);
                console.log(pbValue);
                rmbPb = pbValue;
                countPb = countPb * 1 + rmbPb * 1;
            }

            if (15 == i) {
                var pbValue = $(this).find(".UiBalance_hiH5g").html().trim();
                pbValue = pbValue.replace(",", ".");
                pbValue = pbValue * 0.0847;
                pbValue = pbValue * 10;//转化为毛
                pbValue = pbValue.toFixed(2);
                console.log(pbValue);
                rmbPbClick = pbValue;
                countPbClick = countPbClick * 1 + rmbPbClick * 1;
                countIndex++;
            }

        });

        $(this).find("td").eq(0).html(rmbPb + " /块");
        $(this).find("td").eq(0).css("color", "red");
        //console.log(rmbPb);

        $(this).find("td").eq(1).html(rmbPbClick + " /毛");
        $(this).find("td").eq(1).css("color", "red");
        //console.log(rmbPbClick+"/毛");

        //$(".total_irY03.flex_fDFh9 .value_yWJwa").val("Xxxxxxx");


    });
    if (1 == $("#总花费").length) {
        $("#总花费").remove();
    }
    $(".total_irY03.flex_fDFh9").append("<div id='总花费'>总花费:" + countPb + "/RMB " + "平均点击花费: " + (countPbClick / countIndex).toFixed(2) + " /毛" + "</div>");


}





