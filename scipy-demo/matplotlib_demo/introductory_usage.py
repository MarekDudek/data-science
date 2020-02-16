import matplotlib.pyplot as plt


def two_by_two_figure():
    fig = plt.figure()
    fig.suptitle('No axes on this figure')
    fig, ax_lst = plt.subplots(2, 2)
