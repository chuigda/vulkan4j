function club_doki7_adjustOrdering() {
    var fieldSummary = document.getElementById('field-summary')
    var fieldDetail = document.getElementById('field-detail')
    if (!fieldSummary || !fieldDetail) {
        return
    }

    var fieldSummaryContainer = fieldSummary.parentElement
    var fieldDetailContainer = fieldDetail.parentElement

    var summaryList = fieldSummaryContainer.parentElement
    var detailList = fieldDetailContainer.parentElement

    fieldSummaryContainer.remove()
    summaryList.appendChild(fieldSummaryContainer)
    fieldDetailContainer.remove()
    detailList.appendChild(fieldDetailContainer)

    var tocList = [...document.querySelectorAll('.toc > .toc-list')]
    for (var toc of tocList) {
        var tocChildren = [...toc.children]

        var fieldSummaryTOC = tocChildren.find(function (children) { return children.innerText.toLowerCase().includes('field summary') })
        var fieldDetailTOC = tocChildren.find(function (children) { return children.innerText.toLowerCase().includes('field detail') })
        var ctorDetailsTOC = tocChildren.find(function (children) { return children.innerText.toLowerCase().includes('constructor detail') })

        if (fieldSummaryTOC) {
            fieldSummaryTOC.remove()
            ctorDetailsTOC.parentElement.insertBefore(fieldSummaryTOC, ctorDetailsTOC)
        }

        if (fieldDetailTOC) {
            fieldDetailTOC.remove()
            ctorDetailsTOC.parentElement.appendChild(fieldDetailTOC)
        }
    }
}

club_doki7_adjustOrdering()
