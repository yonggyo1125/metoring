

@RestController
@RequestMapping("/memos")
public class MemoController {
    
    @PostMapping // POST memos
    public String createMemo() {

    }

    @GetMapping
    public List<...> getMemos() {

    }

    @GetMapping("/{id}")
    public ... getMemo(@PathVariable("id") Long id) {

    }

    @DeleteMapping("/{id}")
    public void deleteMemo(@PathVariable("id") Long id) {

    }

    @PatchMapping
    public .... editMemo(...) {

    }
}

/api/v1/.....
/api/v2/...


반복되는 코드 -> 단순화 
코드 효율성
