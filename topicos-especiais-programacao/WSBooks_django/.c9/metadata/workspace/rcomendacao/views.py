{"changed":false,"filter":false,"title":"views.py","tooltip":"/rcomendacao/views.py","undoManager":{"mark":100,"position":100,"stack":[[{"start":{"row":73,"column":12},"end":{"row":73,"column":13},"action":"insert","lines":["l"],"id":127}],[{"start":{"row":73,"column":13},"end":{"row":73,"column":14},"action":"insert","lines":["e"],"id":128}],[{"start":{"row":73,"column":14},"end":{"row":73,"column":15},"action":"insert","lines":["t"],"id":129}],[{"start":{"row":73,"column":15},"end":{"row":73,"column":16},"action":"insert","lines":["e"],"id":130}],[{"start":{"row":73,"column":16},"end":{"row":73,"column":17},"action":"insert","lines":["("],"id":131}],[{"start":{"row":73,"column":17},"end":{"row":73,"column":18},"action":"insert","lines":["r"],"id":132}],[{"start":{"row":73,"column":18},"end":{"row":73,"column":19},"action":"insert","lines":["e"],"id":133}],[{"start":{"row":73,"column":19},"end":{"row":73,"column":20},"action":"insert","lines":["q"],"id":134}],[{"start":{"row":73,"column":20},"end":{"row":73,"column":21},"action":"insert","lines":["u"],"id":135}],[{"start":{"row":73,"column":21},"end":{"row":73,"column":22},"action":"insert","lines":["e"],"id":136}],[{"start":{"row":73,"column":22},"end":{"row":73,"column":23},"action":"insert","lines":["s"],"id":137}],[{"start":{"row":73,"column":23},"end":{"row":73,"column":24},"action":"insert","lines":["t"],"id":138}],[{"start":{"row":73,"column":24},"end":{"row":73,"column":25},"action":"insert","lines":[","],"id":139}],[{"start":{"row":73,"column":25},"end":{"row":73,"column":26},"action":"insert","lines":[" "],"id":140}],[{"start":{"row":73,"column":26},"end":{"row":73,"column":27},"action":"insert","lines":["p"],"id":141}],[{"start":{"row":73,"column":27},"end":{"row":73,"column":28},"action":"insert","lines":["k"],"id":142}],[{"start":{"row":73,"column":28},"end":{"row":73,"column":29},"action":"insert","lines":[")"],"id":143}],[{"start":{"row":73,"column":29},"end":{"row":73,"column":30},"action":"insert","lines":[":"],"id":144}],[{"start":{"row":73,"column":30},"end":{"row":73,"column":34},"action":"remove","lines":["    "],"id":145},{"start":{"row":73,"column":30},"end":{"row":74,"column":0},"action":"insert","lines":["",""]},{"start":{"row":74,"column":0},"end":{"row":74,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":74,"column":4},"end":{"row":85,"column":4},"action":"insert","lines":["livro = get_object_or_404(Livro, pk=pk)","    if request.method == \"POST\":","        form = LivroForm(request.POST, instance=livro)","        if form.is_valid():","            livro = form.save(commit=False)","            #post.author = request.user","            livro.save()","            return redirect('rcomendacao.views.livro_detail', pk=livro.pk)","    else:","        form = LivroForm(instance=livro)","    return render(request, 'rcomendacao/livro_edit.html', {'form': form})","    "],"id":146}],[{"start":{"row":77,"column":8},"end":{"row":84,"column":0},"action":"remove","lines":["if form.is_valid():","            livro = form.save(commit=False)","            #post.author = request.user","            livro.save()","            return redirect('rcomendacao.views.livro_detail', pk=livro.pk)","    else:","        form = LivroForm(instance=livro)",""],"id":147}],[{"start":{"row":77,"column":8},"end":{"row":78,"column":0},"action":"insert","lines":["",""],"id":148},{"start":{"row":78,"column":0},"end":{"row":78,"column":8},"action":"insert","lines":["        "]}],[{"start":{"row":78,"column":8},"end":{"row":78,"column":12},"action":"remove","lines":["    "],"id":149}],[{"start":{"row":75,"column":4},"end":{"row":76,"column":0},"action":"insert","lines":["",""],"id":150},{"start":{"row":76,"column":0},"end":{"row":76,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":76,"column":4},"end":{"row":77,"column":0},"action":"insert","lines":["",""],"id":151},{"start":{"row":77,"column":0},"end":{"row":77,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":75,"column":4},"end":{"row":75,"column":5},"action":"insert","lines":["l"],"id":152}],[{"start":{"row":75,"column":5},"end":{"row":75,"column":6},"action":"insert","lines":["i"],"id":153}],[{"start":{"row":75,"column":6},"end":{"row":75,"column":7},"action":"insert","lines":["v"],"id":154}],[{"start":{"row":75,"column":7},"end":{"row":75,"column":8},"action":"insert","lines":["r"],"id":155}],[{"start":{"row":75,"column":8},"end":{"row":75,"column":9},"action":"insert","lines":["o"],"id":156}],[{"start":{"row":75,"column":9},"end":{"row":75,"column":10},"action":"insert","lines":["."],"id":157}],[{"start":{"row":75,"column":10},"end":{"row":75,"column":11},"action":"insert","lines":["d"],"id":158}],[{"start":{"row":75,"column":11},"end":{"row":75,"column":12},"action":"insert","lines":["e"],"id":159}],[{"start":{"row":75,"column":12},"end":{"row":75,"column":13},"action":"insert","lines":["l"],"id":160}],[{"start":{"row":75,"column":13},"end":{"row":75,"column":14},"action":"insert","lines":["e"],"id":161}],[{"start":{"row":75,"column":14},"end":{"row":75,"column":15},"action":"insert","lines":["t"],"id":162}],[{"start":{"row":75,"column":15},"end":{"row":75,"column":16},"action":"insert","lines":["e"],"id":163}],[{"start":{"row":75,"column":16},"end":{"row":75,"column":17},"action":"insert","lines":["("],"id":164}],[{"start":{"row":75,"column":17},"end":{"row":75,"column":18},"action":"insert","lines":[")"],"id":165}],[{"start":{"row":80,"column":53},"end":{"row":80,"column":54},"action":"remove","lines":["t"],"id":175}],[{"start":{"row":80,"column":52},"end":{"row":80,"column":53},"action":"remove","lines":["i"],"id":176}],[{"start":{"row":80,"column":51},"end":{"row":80,"column":52},"action":"remove","lines":["d"],"id":177}],[{"start":{"row":80,"column":50},"end":{"row":80,"column":51},"action":"remove","lines":["e"],"id":178}],[{"start":{"row":80,"column":50},"end":{"row":80,"column":51},"action":"insert","lines":["l"],"id":179}],[{"start":{"row":80,"column":51},"end":{"row":80,"column":52},"action":"insert","lines":["i"],"id":180}],[{"start":{"row":80,"column":52},"end":{"row":80,"column":53},"action":"insert","lines":["s"],"id":181}],[{"start":{"row":80,"column":53},"end":{"row":80,"column":54},"action":"insert","lines":["t"],"id":182}],[{"start":{"row":80,"column":4},"end":{"row":80,"column":8},"action":"remove","lines":["    "],"id":183}],[{"start":{"row":9,"column":76},"end":{"row":10,"column":0},"action":"insert","lines":["",""],"id":184}],[{"start":{"row":10,"column":0},"end":{"row":11,"column":0},"action":"insert","lines":["from django.core.urlresolvers import reverse",""],"id":185}],[{"start":{"row":10,"column":44},"end":{"row":10,"column":45},"action":"insert","lines":[" "],"id":186}],[{"start":{"row":10,"column":45},"end":{"row":10,"column":46},"action":"insert","lines":["#"],"id":187}],[{"start":{"row":10,"column":46},"end":{"row":10,"column":47},"action":"insert","lines":["d"],"id":188}],[{"start":{"row":10,"column":47},"end":{"row":10,"column":48},"action":"insert","lines":["e"],"id":189}],[{"start":{"row":10,"column":48},"end":{"row":10,"column":49},"action":"insert","lines":["l"],"id":190}],[{"start":{"row":10,"column":49},"end":{"row":10,"column":50},"action":"insert","lines":["e"],"id":191}],[{"start":{"row":10,"column":50},"end":{"row":10,"column":51},"action":"insert","lines":["t"],"id":192}],[{"start":{"row":10,"column":51},"end":{"row":10,"column":52},"action":"insert","lines":["e"],"id":193}],[{"start":{"row":10,"column":52},"end":{"row":11,"column":0},"action":"insert","lines":["",""],"id":194}],[{"start":{"row":11,"column":0},"end":{"row":12,"column":0},"action":"remove","lines":["",""],"id":195}],[{"start":{"row":11,"column":0},"end":{"row":12,"column":0},"action":"remove","lines":["",""],"id":196}],[{"start":{"row":11,"column":0},"end":{"row":12,"column":0},"action":"remove","lines":["",""],"id":197}],[{"start":{"row":11,"column":0},"end":{"row":12,"column":0},"action":"remove","lines":["",""],"id":198}],[{"start":{"row":73,"column":0},"end":{"row":80,"column":0},"action":"remove","lines":["    livro = get_object_or_404(Livro, pk=pk)","    livro.delete()","    ","    if request.method == \"POST\":","        form = LivroForm(request.POST, instance=livro)","        ","    return render(request, 'rcomendacao/livro_list.html', {'form': form})",""],"id":199},{"start":{"row":73,"column":0},"end":{"row":74,"column":61},"action":"insert","lines":["note = get_object_or_404(Note, pk=id).delete()","    return HttpResponseRedirect(reverse('notes.views.notes'))"]}],[{"start":{"row":75,"column":4},"end":{"row":76,"column":0},"action":"insert","lines":["",""],"id":200},{"start":{"row":76,"column":0},"end":{"row":76,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":76,"column":4},"end":{"row":77,"column":0},"action":"insert","lines":["",""],"id":201},{"start":{"row":77,"column":0},"end":{"row":77,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":73,"column":0},"end":{"row":73,"column":4},"action":"insert","lines":["    "],"id":202}],[{"start":{"row":73,"column":4},"end":{"row":73,"column":5},"action":"remove","lines":["n"],"id":203}],[{"start":{"row":73,"column":4},"end":{"row":73,"column":5},"action":"remove","lines":["o"],"id":204}],[{"start":{"row":73,"column":4},"end":{"row":73,"column":5},"action":"remove","lines":["t"],"id":205}],[{"start":{"row":73,"column":4},"end":{"row":73,"column":5},"action":"remove","lines":["e"],"id":206}],[{"start":{"row":73,"column":4},"end":{"row":73,"column":5},"action":"insert","lines":["l"],"id":207}],[{"start":{"row":73,"column":5},"end":{"row":73,"column":6},"action":"insert","lines":["i"],"id":208}],[{"start":{"row":73,"column":6},"end":{"row":73,"column":7},"action":"insert","lines":["v"],"id":209}],[{"start":{"row":73,"column":7},"end":{"row":73,"column":8},"action":"insert","lines":["r"],"id":210}],[{"start":{"row":73,"column":8},"end":{"row":73,"column":9},"action":"insert","lines":["o"],"id":211}],[{"start":{"row":73,"column":30},"end":{"row":73,"column":34},"action":"remove","lines":["Note"],"id":212},{"start":{"row":73,"column":30},"end":{"row":73,"column":31},"action":"insert","lines":["L"]}],[{"start":{"row":73,"column":31},"end":{"row":73,"column":32},"action":"insert","lines":["i"],"id":213}],[{"start":{"row":73,"column":32},"end":{"row":73,"column":33},"action":"insert","lines":["c"],"id":214}],[{"start":{"row":73,"column":32},"end":{"row":73,"column":33},"action":"remove","lines":["c"],"id":215}],[{"start":{"row":73,"column":32},"end":{"row":73,"column":33},"action":"insert","lines":["v"],"id":216}],[{"start":{"row":73,"column":33},"end":{"row":73,"column":34},"action":"insert","lines":["r"],"id":217}],[{"start":{"row":73,"column":34},"end":{"row":73,"column":35},"action":"insert","lines":["o"],"id":218}],[{"start":{"row":74,"column":41},"end":{"row":74,"column":46},"action":"remove","lines":["notes"],"id":219},{"start":{"row":74,"column":41},"end":{"row":74,"column":42},"action":"insert","lines":["r"]}],[{"start":{"row":74,"column":42},"end":{"row":74,"column":43},"action":"insert","lines":["c"],"id":220}],[{"start":{"row":74,"column":43},"end":{"row":74,"column":44},"action":"insert","lines":["o"],"id":221}],[{"start":{"row":74,"column":44},"end":{"row":74,"column":45},"action":"insert","lines":["m"],"id":222}],[{"start":{"row":74,"column":45},"end":{"row":74,"column":46},"action":"insert","lines":["e"],"id":223}],[{"start":{"row":74,"column":46},"end":{"row":74,"column":47},"action":"insert","lines":["n"],"id":224}],[{"start":{"row":74,"column":47},"end":{"row":74,"column":48},"action":"insert","lines":["d"],"id":225}],[{"start":{"row":74,"column":48},"end":{"row":74,"column":49},"action":"insert","lines":["a"],"id":226}],[{"start":{"row":74,"column":49},"end":{"row":74,"column":50},"action":"insert","lines":["c"],"id":227}],[{"start":{"row":74,"column":50},"end":{"row":74,"column":51},"action":"insert","lines":["a"],"id":228}],[{"start":{"row":74,"column":51},"end":{"row":74,"column":52},"action":"insert","lines":["o"],"id":229}],[{"start":{"row":74,"column":59},"end":{"row":74,"column":64},"action":"remove","lines":["notes"],"id":230},{"start":{"row":74,"column":59},"end":{"row":74,"column":60},"action":"insert","lines":["l"]}],[{"start":{"row":74,"column":60},"end":{"row":74,"column":61},"action":"insert","lines":["i"],"id":231}],[{"start":{"row":74,"column":61},"end":{"row":74,"column":62},"action":"insert","lines":["v"],"id":232}],[{"start":{"row":74,"column":62},"end":{"row":74,"column":63},"action":"insert","lines":["r"],"id":233}],[{"start":{"row":74,"column":63},"end":{"row":74,"column":64},"action":"insert","lines":["o"],"id":234}],[{"start":{"row":74,"column":59},"end":{"row":74,"column":64},"action":"remove","lines":["livro"],"id":235},{"start":{"row":74,"column":59},"end":{"row":74,"column":69},"action":"insert","lines":["livro_list"]}],[{"start":{"row":70,"column":2},"end":{"row":76,"column":2},"action":"remove","lines":["  ","    ","def livro_delete(request, pk):","    livro = get_object_or_404(Livro, pk=id).delete()","    return HttpResponseRedirect(reverse('rcomendacao.views.livro_list'))    ","    ","  "],"id":236}]]},"ace":{"folds":[],"scrolltop":776,"scrollleft":0,"selection":{"start":{"row":70,"column":2},"end":{"row":70,"column":2},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":58,"state":"start","mode":"ace/mode/python"}},"timestamp":1450309360000}