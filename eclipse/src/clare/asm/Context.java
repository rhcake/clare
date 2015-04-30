package clare.asm;

import java.util.List;

public interface Context {

	public List<Block> toBlocks(List<In> ins);

	public void printBlock(Block block);
}
